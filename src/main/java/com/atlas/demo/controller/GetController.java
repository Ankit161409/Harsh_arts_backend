package com.atlas.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.atlas.demo.Entity.*;
import com.atlas.demo.Repository.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class GetController {

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



    // =========================
    // GET: ALL CHARCOAL PAINTINGS
    // =========================
    @GetMapping("/getCharcoals")
    public List<Charcoal> getCharcoals() {
        return charRepo.findAll();
    }


    // =========================
    // GET: ALL WATERCOLOR PAINTINGS
    // =========================
    @GetMapping("/getWatercolors")
    public List<WatercolorPaintings> getWatercolors() {
        return watercolorPaintingsRepo.findAll();
    }


    // =========================
    // GET: ALL PEN SKETCHES
    // =========================
    @GetMapping("/getPenSketches")
    public List<Pen> getPenSketches() {
        return penRepo.findAll();
    }


    // =========================
    // GET: ALL MIXED MEDIA PAINTINGS
    // =========================
    @GetMapping("/getMixedMedia")
    public List<MixedMedia> getMixedMedia() {
        return mixedMediaRepo.findAll();
    }


    // =========================
    // GET: ALL DIGITAL ART
    // =========================
    @GetMapping("/getDigitalArt")
    public List<DigitalArt> getDigitalArt() {
        return digitalArtRepo.findAll();
    }


    // =========================
    // GET: ALL COLOURED PENCIL PAINTINGS
    // =========================
    @GetMapping("/getColouredPencil")
    public List<ColouredPencil> getColouredPencil() {
        return colouredPencilRepo.findAll();
    }
}