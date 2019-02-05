package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreService {
	private int wins=10, losses=50, ties=3;
	@RequestMapping(value="/score", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getScore() {
		String str="Wins :"+wins+" Losses :"+losses+" Ties :"+ties;
		return str;
	}
	
	@RequestMapping(value="/score/winsi",method=RequestMethod.GET)
	public int increaseWins() {
		return wins++;
	}
	@RequestMapping(value="/score/lossesi",method=RequestMethod.POST)
	public int increaseLosses() {
		return losses++;
	}
	@RequestMapping(value="/score/tiesi",method=RequestMethod.POST)
	public int increaseTies() {
		return ties++;
	}
	@RequestMapping(value="/score/wins", method=RequestMethod.GET)
	public int getWins() {
		return wins;
	}
	@RequestMapping(value="/score/losses", method=RequestMethod.GET)
	public int getLosses() {
		return losses;
	}
	@RequestMapping(value="/score/ties", method=RequestMethod.GET)
	public int getTies() {
		return ties;
	}
	
}
