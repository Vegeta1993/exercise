import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Gigasecond is added to time and result is returned in LocalDateTime object
 *
 * @author vintux
 */
class Gigasecond {

   private LocalDateTime time;

  /**
   * Constructor to take LocalDate and convert it to LocalDateTime
   * @param moment
   */
  Gigasecond(LocalDate moment) {
    time = LocalDateTime.of(moment, LocalTime.of(0, 0, 0));
  }

  /**
   * Constructor to take LocalDateTime and assign it to field time
   * @param moment
   */
  Gigasecond(LocalDateTime moment) {
    time = moment;
  }

  /**
   * Adds gigasecond to the field and returns
   * @return LocalDateTime after adding gigasecond
   */
  LocalDateTime getDateTime() {
    long giga = 1000000000L;
    return time.plusSeconds(giga);
  }

}
