package com.codefactory.reserva_b.repository.interfaces;

import com.codefactory.reserva_b.entity.impl.FlightEntityImpl;
import java.math.BigInteger;
import java.util.List;

public interface IFlightRepository {
    List<FlightEntityImpl> findAllFlights();
}
