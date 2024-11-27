package com.codefactory.reserva_b.service.interfaces;

import com.codefactory.reserva_b.dto.impl.FlightResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.FlightEntityImpl;

import java.util.List;

public interface IFlightService {
    List<FlightResponseDTOImpl> findAllFlights();
}
