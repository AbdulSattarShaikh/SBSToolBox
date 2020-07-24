package com.ford.vcc.msc.sbs.client.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ford.vcc.msc.sbs.client.entities.Cjr355Object;

@Repository
public interface Cjr355Repository extends JpaRepository<Cjr355Object, String> {

	@Query("FROM Cjr355Object WHERE TRIM(PROPERTYGROUP) = ?1")
	List<Cjr355Object> findByPropertygroup(String propertygroup);     

	@Query("FROM Cjr355Object WHERE TRIM(PROPERTYGROUP) = ?1 AND TRIM(PROPERTYLABEL) = ?2 ")
	Cjr355Object findByAllCriteria(String propertygroup, String propertylabel);

	@Modifying
	@Query(value = "INSERT INTO Cjr355 (propertygroup,propertylabel,propertyvalue) VALUES(:propertygroup, :propertylabel, :propertyvalue)", nativeQuery = true)
	@Transactional
	public int modifyingQueryInsertIntoCjr355(@Param("propertygroup") String propertygroup,
			@Param("propertylabel") String propertylabel, @Param("propertyvalue") String propertyvalue);

	@Modifying(clearAutomatically = true)
	@Query(value = "DELETE FROM Cjr355 WHERE PROPERTYGROUP LIKE :propertygroup%  AND PROPERTYLABEL LIKE :propertylabel% AND PROPERTYVALUE LIKE  :propertyvalue%", nativeQuery = true)
	@Transactional
	public void modifyingQueryDeleteFromCjr355(@Param("propertygroup") String propertygroup,
			@Param("propertylabel") String propertylabel, @Param("propertyvalue") String propertyvalue);

	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE Cjr355 SET PROPERTYVALUE = :propertyvalue WHERE PROPERTYGROUP LIKE :propertygroup%  AND PROPERTYLABEL LIKE :propertylabel% ", nativeQuery = true)
	@Transactional
	public void updatePropertyValue(@Param("propertygroup") String propertygroup,
			@Param("propertylabel") String propertylabel, @Param("propertyvalue") String propertyvalue);

}                                                                              
