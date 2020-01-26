package pl.sdacademy.groupcrud.deleteFunction;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface Query extends CrudRepository<Person, Integer> {
//    @Modifying
//    @Query("delete from contact where id = ?1")
    //   public void userDelete(Integer userId);


    //delete record by id
    @Transactional
    public void deleteByIdEquals(Integer id_remove);






}
