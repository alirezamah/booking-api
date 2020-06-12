package se.almstudio.booking.api.repository;

import se.almstudio.booking.api.model.entity.RoomType;

public interface RoomTypeRepository {

  /**
   * Create a new RoomType
   *
   * @param roomtype RoomType information
   * @return Id for the persisted roomType
   */
  Long create(RoomType roomtype);

  /**
   * Find a roomType by its id
   *
   * @param roomTypeId roomType ID
   * @return RoomType if found, {@code null} if not found
   */
  RoomType findById(Long roomTypeId);
}
