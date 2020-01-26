package pl.sdacademy.groupcrud.deleteFunction;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface QueryRemove extends CrudRepository<Person, Integer> {
//    @Modifying
//    @Query("delete from contact where id = ?1")
 //   public void userDelete(Integer userId);

    @Transactional
    public void deleteByIdEquals(Integer id_remove);
}
