package com.atlas.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.atlas.demo.Entity.*;
import com.atlas.demo.Repository.*;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "https://harsh-artz26.onrender.com")
@CrossOrigin(origins = "https://localhost:3000")
public class ByIdController {

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


    // =====================================
    // GET CHARCOAL PAINTING BY ID
    // GET /api/getCharcoalById/{id}
    // =====================================
    @GetMapping("/getCharcoalById/{id}")
    public ResponseEntity<?> getCharcoalById(@PathVariable String id) {

        return charRepo.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Charcoal painting not found with id: " + id));
    }


    // =====================================
    // GET WATERCOLOR PAINTING BY ID
    // GET /api/getWatercolorById/{id}
    // =====================================
    @GetMapping("/getWatercolorById/{id}")
    public ResponseEntity<?> getWatercolorById(@PathVariable String id) {

        return watercolorPaintingsRepo.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Watercolor painting not found with id: " + id));
    }


    // =====================================
    // GET PEN SKETCH BY ID
    // GET /api/getPenSketchById/{id}
    // =====================================
    @GetMapping("/getPenSketchById/{id}")
    public ResponseEntity<?> getPenSketchById(@PathVariable String id) {

        return penRepo.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Pen sketch not found with id: " + id));
    }


    // =====================================
    // GET MIXED MEDIA PAINTING BY ID
    // GET /api/getMixedMediaById/{id}
    // =====================================
    @GetMapping("/getMixedMediaById/{id}")
    public ResponseEntity<?> getMixedMediaById(@PathVariable String id) {

        return mixedMediaRepo.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Mixed media painting not found with id: " + id));
    }


    // =====================================
    // GET DIGITAL ART BY ID
    // GET /api/getDigitalArtById/{id}
    // =====================================
    @GetMapping("/getDigitalArtById/{id}")
    public ResponseEntity<?> getDigitalArtById(@PathVariable String id) {

        return digitalArtRepo.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Digital artwork not found with id: " + id));
    }


    // =====================================
    // GET COLOURED PENCIL ART BY ID
    // GET /api/getColouredPencilById/{id}
    // =====================================
    @GetMapping("/getColouredPencilById/{id}")
    public ResponseEntity<?> getColouredPencilById(@PathVariable String id) {

        return colouredPencilRepo.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Coloured pencil artwork not found with id: " + id));
    }
}