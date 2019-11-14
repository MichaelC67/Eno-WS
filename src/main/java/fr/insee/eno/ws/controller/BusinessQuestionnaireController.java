package fr.insee.eno.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Generation of questionnaire (business vision)")
@RestController
@RequestMapping("/business")
public class BusinessQuestionnaireController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BusinessQuestionnaireController.class);
	
	
	@Operation(description="Check if eno is alive")
	@ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "I'm alive")
    })
    @GetMapping(value="/healthcheck", produces="application/json")
   	public ResponseEntity<?> healthcheck() {
   		return new ResponseEntity<>("i'm alive",HttpStatus.OK);
   	}
}