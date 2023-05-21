package xyz.device.controller.api;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.device.model.DeviceInfoVO;
import xyz.device.service.DeviceInfoService;

import java.util.HashMap;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Setter
@AllArgsConstructor
@RestController
@RequestMapping("/api/device")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:8080"}, allowedHeaders = "*")
public class DeviceInfoController {

    private DeviceInfoService deviceInfoService;

    @GetMapping("/all")
    public ResponseEntity<Object> getAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);

        List<DeviceInfoVO> deviceInfoVOList = deviceInfoService.selectAll();

        if (deviceInfoVOList == null || deviceInfoVOList.isEmpty()) {
            HashMap<String, String> map = new HashMap<>();
            map.put("error", "device list not found");

            return new ResponseEntity<>(map, headers, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(deviceInfoVOList, headers, HttpStatus.OK);
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Object> getById(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);

        DeviceInfoVO deviceInfoVO = deviceInfoService.selectById(id);

        if (deviceInfoVO == null) {
            HashMap<String, String> map = new HashMap<>();
            String message = "device(ID: " + id + ") not found";
            map.put("error", message);

            return new ResponseEntity<>(map, headers, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(deviceInfoVO, headers, HttpStatus.OK);
        }
    }

    @GetMapping("/company/{company}")
    public ResponseEntity<Object> getByCompany(@PathVariable String company) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);

        List<DeviceInfoVO> deviceInfoVOs = deviceInfoService.selectByCompany(company);

        if (deviceInfoVOs == null || deviceInfoVOs.isEmpty()) {
            HashMap<String, String> map = new HashMap<>();
            String message = "device(company: " + company + ") not found";
            map.put("error", message);

            return new ResponseEntity<>(map, headers, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(deviceInfoVOs, headers, HttpStatus.OK);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Object> addDevice(@RequestBody DeviceInfoVO deviceInfoVO) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);

        deviceInfoService.insert(deviceInfoVO);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("message", "device " + deviceInfoVO.getId() + " added");

        return new ResponseEntity<>(map, headers, HttpStatus.OK);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Object> deleteDevice(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);

        deviceInfoService.delete(id);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("message", "device " + id + " deleted");

        return new ResponseEntity<>(map, headers, HttpStatus.OK);

    }
}
