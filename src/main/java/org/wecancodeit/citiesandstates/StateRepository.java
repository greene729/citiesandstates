package org.wecancodeit.citiesandstates;

import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<State, Long>
{

	State findByAbbreviationIgnoreCase(String abbr);

}


