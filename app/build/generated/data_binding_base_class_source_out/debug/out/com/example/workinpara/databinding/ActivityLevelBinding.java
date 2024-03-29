// Generated by view binder compiler. Do not edit!
package com.example.workinpara.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.workinpara.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLevelBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton BtnBackLevel;

  @NonNull
  public final EditText EditTextLevel;

  @NonNull
  public final ImageView ImgLevel;

  @NonNull
  public final ImageView WomanLevel;

  @NonNull
  public final ImageView mountBackLevel;

  private ActivityLevelBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton BtnBackLevel, @NonNull EditText EditTextLevel,
      @NonNull ImageView ImgLevel, @NonNull ImageView WomanLevel,
      @NonNull ImageView mountBackLevel) {
    this.rootView = rootView;
    this.BtnBackLevel = BtnBackLevel;
    this.EditTextLevel = EditTextLevel;
    this.ImgLevel = ImgLevel;
    this.WomanLevel = WomanLevel;
    this.mountBackLevel = mountBackLevel;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLevelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLevelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_level, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLevelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BtnBackLevel;
      ImageButton BtnBackLevel = ViewBindings.findChildViewById(rootView, id);
      if (BtnBackLevel == null) {
        break missingId;
      }

      id = R.id.EditTextLevel;
      EditText EditTextLevel = ViewBindings.findChildViewById(rootView, id);
      if (EditTextLevel == null) {
        break missingId;
      }

      id = R.id.ImgLevel;
      ImageView ImgLevel = ViewBindings.findChildViewById(rootView, id);
      if (ImgLevel == null) {
        break missingId;
      }

      id = R.id.WomanLevel;
      ImageView WomanLevel = ViewBindings.findChildViewById(rootView, id);
      if (WomanLevel == null) {
        break missingId;
      }

      id = R.id.mountBackLevel;
      ImageView mountBackLevel = ViewBindings.findChildViewById(rootView, id);
      if (mountBackLevel == null) {
        break missingId;
      }

      return new ActivityLevelBinding((ConstraintLayout) rootView, BtnBackLevel, EditTextLevel,
          ImgLevel, WomanLevel, mountBackLevel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
