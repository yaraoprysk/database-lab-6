package com.lab6.controller.implementation;

@RestController
public class HealthController {
    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public ResponseEntity returnHealthCheckResponse() {
        return new ResponseEntity<>("Everything is OK", HttpStatus.OK);
    }
}
