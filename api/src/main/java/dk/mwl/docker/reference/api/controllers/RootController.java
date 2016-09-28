package dk.mwl.docker.reference.api.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
@Api(description = "Root resource")
public class RootController {
    @ApiOperation(value = "hello", notes = "")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> create() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
