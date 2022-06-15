package bandcode.service;

import bandcode.model.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bandcode.repository.BandRepository;

@Service
public class BandService {

  // INITIALIZE BAND REPOSITORY
  @Autowired
  private BandRepository bandRepository;

  // CONSTRUCTOR
  public BandService(BandRepository bandRepository) {
    this.bandRepository = bandRepository;
  }

  // GETTERS & SETTERS
  public BandRepository getBandRepository() {
    return bandRepository;
  }

  public void setBandRepository(BandRepository bandRepository) {
    this.bandRepository = bandRepository;
  }

  // INSERT BAND
  public void insertBand(Band bandToInsert) {
    bandRepository.save(bandToInsert);
  }
}
