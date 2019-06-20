package com.jenkins.cicdjenkinsexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kamil.marabet on 6/6/2019.
 */
@RestController
@RequestMapping("/version")
public class GreenController {

    @GetMapping
    public String version() {
        return "Green App v2.0";
    }
}
