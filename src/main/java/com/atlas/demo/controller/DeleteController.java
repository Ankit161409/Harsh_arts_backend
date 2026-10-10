package com.atlas.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.atlas.demo.Repository.CharRepo;
import com.atlas.demo.Repository.WatercolorRepo;
import com.atlas.demo.Repository.PenRepo;
import com.atlas.demo.Repository.MixedMediaRepo;
import com.atlas.demo.Repository.DigitalArtRepo;
import com.atlas.demo.Repository.ColouredPencilRepo;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://harsh-artz26.onrender.com")
public class DeleteController {

    @Autowired
    private CharRepo charRepo;

    @Autowired
    private WatercolorRepo watercolorPaintingsRepo;

    @Autowired
    private PenRepo penRepo;

    @Autowired
    private MixedMediaRepo mixedMediaRepo;

    @Autowired
    private DigitalArtRepo digitalArtRepo;

    @Autowired
    private ColouredPencilRepo colouredPencilRepo;


    // ==================== DELETE CHARCOAL ====================

    @DeleteMapping("/deletecharcoal/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCharcoal(@PathVariable String id) {

        if (!charRepo.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Charcoal artwork not found"
            );
        }

        charRepo.deleteById(id);
    }


    // ==================== DELETE WATERCOLOR ====================

    @DeleteMapping("/deleteWatercolor/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteWatercolor(@PathVariable String id) {

        if (!watercolorPaintingsRepo.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Watercolor artwork not found"
            );
        }

        watercolorPaintingsRepo.deleteById(id);
    }


    // ==================== DELETE PEN ====================

    @DeleteMapping("/deletePen/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePen(@PathVariable String id) {

        if (!penRepo.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Pen artwork not found"
            );
        }

        penRepo.deleteById(id);
    }


    // ==================== DELETE MIXED MEDIA ====================

    @DeleteMapping("/deleteMixedMedia/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMixedMedia(@PathVariable String id) {

        if (!mixedMediaRepo.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Mixed media artwork not found"
            );
        }

        mixedMediaRepo.deleteById(id);
    }


    // ==================== DELETE DIGITAL ART ====================

    @DeleteMapping("/deleteDigitalArt/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDigitalArt(@PathVariable String id) {

        if (!digitalArtRepo.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Digital artwork not found"
            );
        }

        digitalArtRepo.deleteById(id);
    }


    // ==================== DELETE COLOURED PENCIL ====================

    @DeleteMapping("/deleteColouredPencil/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteColouredPencil(@PathVariable String id) {

        if (!colouredPencilRepo.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Coloured pencil artwork not found"
            );
        }

        colouredPencilRepo.deleteById(id);
    }
}