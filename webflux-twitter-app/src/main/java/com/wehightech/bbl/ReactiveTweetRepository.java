package com.wehightech.bbl;

import com.wehightech.bbl.model.Tweet;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ReactiveTweetRepository extends ReactiveCrudRepository<Tweet, String> {

    @Tailable
    Flux<Tweet> findWithTailableCursorBy();

}
