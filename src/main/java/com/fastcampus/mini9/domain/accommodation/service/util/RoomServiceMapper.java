package com.fastcampus.mini9.domain.accommodation.service.util;

import static com.fastcampus.mini9.domain.accommodation.service.usecase.RoomQuery.*;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.fastcampus.mini9.domain.accommodation.entity.room.Room;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoomServiceMapper {
	// findRoomsInAccommodation()
	List<RoomResponse> entityListToResponseList(List<Room> roomList);

	// TODO: stock 조회 로직
	@Mapping(target = "capacity_max", source = "capacityMax")
	@Mapping(target = "stock", constant = "2")
	RoomResponse entityToResponse(Room room);

	// findRoom()
	// TODO: stock 조회 로직
	@Mapping(target = "capacity_max", source = "capacityMax")
	@Mapping(target = "stock", constant = "2")
	FindRoomResponse entityToFind(Room room);
}