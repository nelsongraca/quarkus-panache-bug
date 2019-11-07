package com.flowkode.panache;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestEntityRepository
        //swap these two below and the bug does not manifest itself
        extends BaseRepository<TestEntity> {
    //implements PanacheRepositoryBase<TestEntity, String> {

}
