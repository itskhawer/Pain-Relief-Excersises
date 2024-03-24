package com.example.painreliefexcersises;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.target.DrawableImageViewTarget;
import com.bumptech.glide.request.transition.Transition;

public class KneePain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knee_pain);

        ImageView gifImageView1 = findViewById(R.id.imageView1);
        ImageView gifImageView2 = findViewById(R.id.imageView2);
        ImageView gifImageView3 = findViewById(R.id.imageView3);
        ImageView gifImageView4 = findViewById(R.id.imageView4);
        ImageView gifImageView5 = findViewById(R.id.imageView5);
        ImageView gifImageView6 = findViewById(R.id.imageView6);
        ImageView gifImageView7 = findViewById(R.id.imageView7);

        Glide.with(this)
                .asGif()
                .load(R.raw.knee1)
                .into(new DrawableImageViewTarget(gifImageView1){
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @NonNull Transition<? super Drawable> transition){
                        super.onResourceReady(resource, transition);
                        // Access the GifDrawable for additional settings if needed
                        GifDrawable gifDrawable = (GifDrawable) resource;
                        gifDrawable.setLoopCount(GifDrawable.LOOP_FOREVER);
                    }
                }.getView());
        Glide.with(this)
                .asGif()
                .load(R.raw.knee2)
                .into(new DrawableImageViewTarget(gifImageView2){
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @NonNull Transition<? super Drawable> transition){
                        super.onResourceReady(resource, transition);
                        // Access the GifDrawable for additional settings if needed
                        GifDrawable gifDrawable = (GifDrawable) resource;
                        gifDrawable.setLoopCount(GifDrawable.LOOP_FOREVER);
                    }
                }.getView());
        Glide.with(this)
                .asGif()
                .load(R.raw.knee3)
                .into(new DrawableImageViewTarget(gifImageView3){
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @NonNull Transition<? super Drawable> transition){
                        super.onResourceReady(resource, transition);
                        // Access the GifDrawable for additional settings if needed
                        GifDrawable gifDrawable = (GifDrawable) resource;
                        gifDrawable.setLoopCount(GifDrawable.LOOP_FOREVER);
                    }
                }.getView());
        Glide.with(this)
                .asGif()
                .load(R.raw.knee4)
                .into(new DrawableImageViewTarget(gifImageView4){
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @NonNull Transition<? super Drawable> transition){
                        super.onResourceReady(resource, transition);
                        // Access the GifDrawable for additional settings if needed
                        GifDrawable gifDrawable = (GifDrawable) resource;
                        gifDrawable.setLoopCount(GifDrawable.LOOP_FOREVER);
                    }
                }.getView());
        Glide.with(this)
                .asGif()
                .load(R.raw.knee5)
                .into(new DrawableImageViewTarget(gifImageView5){
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @NonNull Transition<? super Drawable> transition){
                        super.onResourceReady(resource, transition);
                        // Access the GifDrawable for additional settings if needed
                        GifDrawable gifDrawable = (GifDrawable) resource;
                        gifDrawable.setLoopCount(GifDrawable.LOOP_FOREVER);
                    }
                }.getView());
        Glide.with(this)
                .asGif()
                .load(R.raw.knee6)
                .into(new DrawableImageViewTarget(gifImageView6){
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @NonNull Transition<? super Drawable> transition){
                        super.onResourceReady(resource, transition);
                        // Access the GifDrawable for additional settings if needed
                        GifDrawable gifDrawable = (GifDrawable) resource;
                        gifDrawable.setLoopCount(GifDrawable.LOOP_FOREVER);
                    }
                }.getView());
        Glide.with(this)
                .asGif()
                .load(R.raw.knee7)
                .into(new DrawableImageViewTarget(gifImageView7){
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @NonNull Transition<? super Drawable> transition){
                        super.onResourceReady(resource, transition);
                        // Access the GifDrawable for additional settings if needed
                        GifDrawable gifDrawable = (GifDrawable) resource;
                        gifDrawable.setLoopCount(GifDrawable.LOOP_FOREVER);
                    }
                }.getView());
    }
}