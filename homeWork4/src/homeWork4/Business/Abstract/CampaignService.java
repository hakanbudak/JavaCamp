package homeWork4.Business.Abstract;

import homeWork4.Entities.Concrete.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
}
