package com.example.sample.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@AllArgsConstructor
public class Movie {
	private  String id; // 12cfb892-aac0-4c5b-94af-521852e46d6a
	private  String title; // Grave of the Fireflies
	private  String original_title; // 火垂るの墓
	private  String original_title_romanised; // Hotaru no haka
	private  String image; // https;
					// ////image.tmdb.org/t/p/w600_and_h900_bestv2/qG3RYlIVpTYclR9TYIsy8p7m7AT.jpg
	private  String movie_banner; // https; ////image.tmdb.org/t/p/original/vkZSd0Lp8iCVBGpFH9L7LzLusjS.jpg
	private  String description; // In the latter part of World War II, a boy and his sister, orphaned when their
						// mother is killed in the firebombing of Tokyo, are left to survive on their
						// own in what remains of civilian life in Japan. The plot follows this boy and
						// his sister as they do their best to survive in the Japanese countryside,
						// battling hunger, prejudice, and pride in their own quiet, personal battle.
	private  String director; // Isao Takahata
	private  String producer; // Toru Hara
	private  int release_date; // 1988
	private  int running_time; // 89
	private  int rt_score; // 97
	private  List<String> people; // https; ////ghibliapi.herokuapp.com/people/
	private  List<String> species; // https;
							// ////ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2
	private  List<String> locations; // https; ////ghibliapi.herokuapp.com/locations/
	private  List<String> vehicles; // https; ////ghibliapi.herokuapp.com/vehicles/
	private  String url; // https; ////ghibliapi.herokuapp.com/films/12cfb892-aac0-4c5b-94af-521852e46d6a
	

}
