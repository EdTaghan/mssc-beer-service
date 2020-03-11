package edtaghan.springframework.msscbeerservice.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edtaghan.springframework.msscbeerservice.web.model.BeerDto;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerByIId(@PathVariable("beerId") UUID beerId) {
		
		//todo impl
		return new ResponseEntity<>(BeerDto.builder().build(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
		
		//todo impl
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PutMapping("/{beerId}")
	public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
		
		//todo impl
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	

}
