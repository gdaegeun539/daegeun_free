package xyz.device.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/device")
public class DeviceInfoController {

    @GetMapping("/test")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("test");
    }
}