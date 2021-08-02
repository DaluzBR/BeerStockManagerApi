package br.com.daluz.BeerStockManagerApi.mappers;


import br.com.daluz.BeerStockManagerApi.dtos.BeerDTO;
import br.com.daluz.BeerStockManagerApi.entities.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
