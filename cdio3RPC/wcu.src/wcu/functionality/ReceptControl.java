package wcu.functionality;

import java.util.ArrayList;
import java.util.List;

import cdio3.gwt.client.model.ReceptDTO;
import cdio3.gwt.server.DALException;
import dao.interf.IReceptDAO;

public class ReceptControl implements IReceptDAO {
	
	FileHandler receptFil;
	ArrayList<ReceptDTO> recDB = new ArrayList<ReceptDTO>();

	public ReceptControl() {

		receptFil = new FileHandler();
		recDB = receptFil.readReceptDB();

	}

	@Override
	public ReceptDTO getRecept(int receptId) throws DALException {
		ReceptDTO hentRecept = new ReceptDTO();
		for (int i = 0; i < recDB.size(); i ++){
			if (receptId == recDB.get(i).getReceptId()){
				return recDB.get(i);
			}
		}
		return hentRecept;
	}
	@Override
	public List<ReceptDTO> getReceptList() throws DALException {
		return recDB;
	}

	@Override
	public void createRecept(ReceptDTO recept) throws DALException {
		recDB.add(recept);
		receptFil.writeReceptDB(recDB);
		
	}

	@Override
	public void updateRecept(ReceptDTO recept) throws DALException {
		for(int i = 0; i < recDB.size(); i++){
			if(recept.getReceptId() == recDB.get(i).getReceptId()){
				recDB.set(i, recept);
			}
		}
		receptFil.writeReceptDB(recDB);
	}

}
