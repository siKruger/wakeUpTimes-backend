package de.simonkrueger.wakeuptimes.controller;


import de.simonkrueger.wakeuptimes.model.Preset;
import de.simonkrueger.wakeuptimes.service.PresetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PresetController {

    @Autowired
    PresetService preServ;



    @GetMapping("/wakeup/presets/customTimes")
    public List<Preset> getCustomTimes() {
        log.info("Zugriff auf CustomTimes");
        return preServ.getCustomTimes();
    }

    @GetMapping("/wakeup/presets/holidays")
    public List<Preset> getHolidayTimes() {
        return preServ.getHolidayTime();
    }

    @GetMapping("/wakeup/presets")
    public List<Preset> getAllPresets() {
        return preServ.getAllPresets();
    }
}
