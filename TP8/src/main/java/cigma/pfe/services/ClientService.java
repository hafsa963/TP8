package cigma.pfe.services;

import cigma.pfe.models.Client;

public interface ClientService {

	boolean save(Client c);
	Client find(Long id);
	Client update(Client c);
	void delete(Client c);

}
