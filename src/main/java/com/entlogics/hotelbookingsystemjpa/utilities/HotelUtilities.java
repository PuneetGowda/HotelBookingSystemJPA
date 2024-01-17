package com.entlogics.hotelbookingsystemjpa.utilities;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.entlogics.hotelbookingsystemjpa.entity.Hotel;

@Component
public class HotelUtilities {

	public Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a > b ? a : b);
	}
	
	public Optional<Integer> findMinValueOptional(List<Integer> integerList) {
		return integerList.stream()
				.reduce((a, b) -> a < b ? a : b);
	}
	
	public Integer findMaxValue(List<Integer> integerList) {
		return integerList.stream()
				.reduce(integerList.get(0), (a, b) -> a > b ? a : b);
	}
	
	public Integer findMinValue(List<Integer> integerList) {
		return integerList.stream()
				.reduce(integerList.get(0), (a, b) -> a < b ? a : b);
	}
	
	public List<Hotel> sortByHotelName(List<Hotel> hotels) {
		Comparator<Hotel> nameComparator = Comparator.comparing(Hotel::getHotel_name);	
		Comparator<Hotel> nameNullComparator = Comparator.nullsLast(nameComparator);
		
		hotels.sort(nameNullComparator);
		return hotels;
	}
}
