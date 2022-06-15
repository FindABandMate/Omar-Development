package bandcode.controller;

import bandcode.model.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bandcode.service.BandService;

@RestController
@RequestMapping("band")
public class BandController {

  // INITIALIZE BAND SERVICE
  @Autowired
  private BandService bandService;

  // CONSTRUCTOR
  public BandController(BandService bandService) {
    this.bandService = bandService;
  }

  // GETTERS & SETTERS
  public BandService getBandService() {
    return bandService;
  }

  public void setBandService(BandService bandService) {
    this.bandService = bandService;
  }

  // INSERT BAND
  // MAPPING FOR HTTP REQUEST
  @PostMapping("/insertBand") //localhost:8091/band/insertBand
  public String insertBand(@RequestBody Band band) {
    // TRY TO INSERT BAND
    try {
      // CALL BAND SERVICE TO INSERT BAND
      bandService.insertBand(band);

      // RETURN SUCCESS STATEMENT
      return "Successful: Insert Band\n\n"
          + "Forwarded Band Info to Kafka via Producer\n\n"
          + "Please find Band Data listed below:\n"
          + band.toString().replace("[","").replace("]","");
    }
    catch (Exception e) {

      // PRINT STACK TRACE
      e.printStackTrace();

      // UNEXPECTED EXCEPTION
      return "Error: Unexpected Exception | Please refer to console log";
    }
  }
}
