package de.simonkrueger.wakeuptimes.controller;


import de.simonkrueger.wakeuptimes.model.Preset;
import de.simonkrueger.wakeuptimes.service.PresetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
public class PresetController {

    @Autowired
    PresetService preServ;



    @GetMapping("/wakeup/customTimes")
    public List<Preset> getCustomTimes() {
        return preServ.getCustomTimes();
    }
}
