package cdio3.gwt.client.service;

import cdio3.gwt.client.model.OperatoerDTO;
import cdio3.gwt.client.model.ProduktBatchDTO;
import cdio3.gwt.client.model.RaavareBatchDTO;
import cdio3.gwt.client.model.RaavareDTO;
import cdio3.gwt.client.model.ReceptDTO;

public interface DBServiceClientInt {
	//TODO mangler raavare (slet), recept(slet), raavarebatch, produktbatch, produktbatchkomp.
	void authenticateUser(String username, String password);
	void getUser(int oprId);
	void getUserList();
	void deleteElement(int eId,String valg);
	void createUser(OperatoerDTO opr);
	void updateUser(OperatoerDTO opr);
	void getRaavareList();
	void createRaavare(RaavareDTO raa);
	void getReceptList();
	void createRecept(ReceptDTO rec);
	void getRaavareBatchList();
	void createRaavareBatch(RaavareBatchDTO rab);
	void getProduktBatchList();
	void createProduktBatch(ProduktBatchDTO prb);
	void getProduktBatchKompList();
}
