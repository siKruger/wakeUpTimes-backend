package de.simonkrueger.wakeuptimes.service;


import de.simonkrueger.wakeuptimes.model.Preset;
import de.simonkrueger.wakeuptimes.repository.PresetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PresetService {
    @Autowired
    PresetRepository preRepo;


    public List<Preset> getCustomTimes() {
        return preRepo.findByPresetName("singleTime");
    }
}
