package de.simonkrueger.wakeuptimes.service;

import de.simonkrueger.wakeuptimes.model.Settings;
import de.simonkrueger.wakeuptimes.repository.SettingsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SettingsService {
    @Autowired
    SettingsRepository setRe;

    public Iterable<Settings> getAllSettings() {
        return setRe.findAll();
    }

    public Iterable<Settings> findSettingByName(String data) {
        return setRe.findBySettingName(data);
    }
}
