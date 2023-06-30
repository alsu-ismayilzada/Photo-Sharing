package com.example.photosharing.manager;
import com.example.photosharing.dto.PhotoDto;
import com.example.photosharing.mapper.PhotoMapper;
import com.example.photosharing.repository.PhotoRepository;
import com.example.photosharing.service.PhotoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class PhotoManager implements PhotoService {

    private final PhotoRepository photoRepository;
    private final PhotoMapper photoMapper;

    @Override
    public void add(PhotoDto photo) {
        photoRepository.save(photoMapper.toPhotoEntity(photo));
    }

    @Override
    public void deleteById(int id) {
        photoRepository.deleteById(id);
    }

    @Override
    public PhotoDto getById(int id) {
        return photoRepository.findById(id)
                .stream().map(photoMapper::toPhotoDto)
                .findFirst().get();
    }

    @Override
    public List<PhotoDto> getAll() {
        return photoRepository.findAll()
                .stream().map(photoMapper::toPhotoDto)
                .toList();
    }
}
