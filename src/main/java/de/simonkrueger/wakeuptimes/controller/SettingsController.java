package de.simonkrueger.wakeuptimes.controller;


import de.simonkrueger.wakeuptimes.model.Settings;
import de.simonkrueger.wakeuptimes.service.SettingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SettingsController {

    @Autowired
    SettingsService setServ;


    @GetMapping("/wakeup/settings")
    public Iterable<Settings> getAllSettings() {
        return setServ.getAllSettings();
    }

    @GetMapping("/wakeup/settings/{setting}")
    public Iterable<Settings> getSetting(@PathVariable String setting) {
        return setServ.findSettingByName(setting);
    }
}
