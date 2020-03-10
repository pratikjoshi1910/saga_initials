package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DemoDTO;

@RestController
@RequestMapping("/demo")

public class DemoController {

	@GetMapping("/test")
	public ResponseEntity<DemoDTO> placeOrder() {

		DemoDTO demoDTO = new DemoDTO();
		demoDTO.setAge("22");
		demoDTO.setName("Ishan");
		return new ResponseEntity<DemoDTO>(demoDTO, HttpStatus.OK);

	}

	@PostMapping("/test")
	public void placeOrder(@RequestBody DemoDTO demoDTO) {

		System.out.println(demoDTO.getName());

	}

}
