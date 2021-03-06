package top.itning.yunshunas.music.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import top.itning.yunshunas.music.dto.MusicDTO;
import top.itning.yunshunas.music.entity.Music;


/**
 * @author itning
 * @date 2020/9/5 11:32
 */
@Mapper
public interface MusicConverter {

    MusicConverter INSTANCE = Mappers.getMapper(MusicConverter.class);

    /**
     * 实体转DTO
     *
     * @param music 实体
     * @return DTO
     */
    @Mappings({})
    MusicDTO entity2dto(Music music);
}