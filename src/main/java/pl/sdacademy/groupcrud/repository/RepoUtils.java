package pl.sdacademy.groupcrud.repository;

import pl.sdacademy.groupcrud.controller.PersonController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class RepoUtils {
    public static <T> List<T> getListFromIterator(Iterable<T> iterable) {

        //create a list from the iterable
        List<T> list = StreamSupport
                .stream(iterable.spliterator(), false)
                .collect(Collectors.toList());

        return list;
    }
}
