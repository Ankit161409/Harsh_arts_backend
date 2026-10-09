package com.atlas.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.atlas.demo.Entity.*;
import com.atlas.demo.Repository.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class AddController {

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


    // CHARCOAL
    @PostMapping("/addCharcols")
    public Charcoal addCharcoal(
            @RequestParam("title") String title,
            @RequestParam("image") MultipartFile image
    ) throws IOException {

        Charcoal charcoal = new Charcoal();

        charcoal.setTitle(title);
        charcoal.setImage(image.getBytes());

        return charRepo.save(charcoal);
    }


    // WATERCOLOR
    @PostMapping("/addWatercolor")
    public WatercolorPaintings addWatercolor(
            @RequestParam("title") String title,
            @RequestParam("image") MultipartFile image
    ) throws IOException {

        WatercolorPaintings watercolor = new WatercolorPaintings();

        watercolor.setTitle(title);
        watercolor.setImage(image.getBytes());

        return watercolorPaintingsRepo.save(watercolor);
    }


    // PEN
    @PostMapping("/addPen")
    public Pen addPen(
            @RequestParam("title") String title,
            @RequestParam("image") MultipartFile image
    ) throws IOException {

        Pen pen = new Pen();

        pen.setTitle(title);
        pen.setImage(image.getBytes());

        return penRepo.save(pen);
    }


    // MIXED MEDIA
    @PostMapping("/addMixedMedia")
    public MixedMedia addMixedMedia(
            @RequestParam("title") String title,
            @RequestParam("image") MultipartFile image
    ) throws IOException {

        MixedMedia mixedMedia = new MixedMedia();

        mixedMedia.setTitle(title);
        mixedMedia.setImage(image.getBytes());

        return mixedMediaRepo.save(mixedMedia);
    }


    // DIGITAL ART
    @PostMapping("/addDigitalArt")
    public DigitalArt addDigitalArt(
            @RequestParam("title") String title,
            @RequestParam("image") MultipartFile image
    ) throws IOException {

        DigitalArt digitalArt = new DigitalArt();

        digitalArt.setTitle(title);
        digitalArt.setImage(image.getBytes());

        return digitalArtRepo.save(digitalArt);
    }



    // COLOURED PENCIL
    @PostMapping("/addColouredPencil")
    public ColouredPencil addColouredPencil(
            @RequestParam("title") String title,
            @RequestParam("image") MultipartFile image
    ) throws IOException {

        ColouredPencil colouredPencil = new ColouredPencil();

        colouredPencil.setTitle(title);
        colouredPencil.setImage(image.getBytes());

        return colouredPencilRepo.save(colouredPencil);
    }

}





