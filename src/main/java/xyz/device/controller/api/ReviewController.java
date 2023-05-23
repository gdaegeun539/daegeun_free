package xyz.device.controller.api;



import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.device.model.ReviewVO;
import xyz.device.service.ReviewService;

import java.util.HashMap;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Setter
@AllArgsConstructor
@RestController
@RequestMapping("/api/review")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:8080"}, allowedHeaders = "*")
public class ReviewController {

    private ReviewService reviewService;

    @PostMapping("/")
    public ResponseEntity<Object> add(@RequestBody ReviewVO reviewVO) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);

        reviewService.insert(reviewVO);

        HashMap<Object, Object> map = new HashMap<>();
        map.put("message", "review " + reviewVO.getId() + " added");

        return new ResponseEntity<>(map, headers, HttpStatus.CREATED);
    }

    @GetMapping("/dev_id/{id}")
    public ResponseEntity<Object> readByDeviceId(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);

        List<ReviewVO> reviewVOList = reviewService.selectByDevId(id);

        if (reviewVOList == null) {
            HashMap<String, String> map = new HashMap<>();
            map.put("error", "review list not found");

            return new ResponseEntity<>(map, headers, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(reviewVOList, headers, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);

        reviewService.delete(id);

        HashMap<Object, Object> map = new HashMap<>();
        map.put("message", "review " + id + " deleted");

        return new ResponseEntity<>(map, headers, HttpStatus.OK);
    }
}
