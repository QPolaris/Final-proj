// Generated by view binder compiler. Do not edit!
package cs.mad.flashcards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import cs.mad.flashcards.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout linearLayoutCompat2;

  @NonNull
  public final MaterialButton localWeatherButton;

  @NonNull
  public final TextView text;

  @NonNull
  public final Button zipCodeButton;

  @NonNull
  public final EditText zipInput;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView,
      @NonNull ConstraintLayout linearLayoutCompat2, @NonNull MaterialButton localWeatherButton,
      @NonNull TextView text, @NonNull Button zipCodeButton, @NonNull EditText zipInput) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.linearLayoutCompat2 = linearLayoutCompat2;
    this.localWeatherButton = localWeatherButton;
    this.text = text;
    this.zipCodeButton = zipCodeButton;
    this.zipInput = zipInput;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      ConstraintLayout linearLayoutCompat2 = (ConstraintLayout) rootView;

      id = R.id.local_weather_button;
      MaterialButton localWeatherButton = rootView.findViewById(id);
      if (localWeatherButton == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = rootView.findViewById(id);
      if (text == null) {
        break missingId;
      }

      id = R.id.zip_code_button;
      Button zipCodeButton = rootView.findViewById(id);
      if (zipCodeButton == null) {
        break missingId;
      }

      id = R.id.zipInput;
      EditText zipInput = rootView.findViewById(id);
      if (zipInput == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, imageView, linearLayoutCompat2,
          localWeatherButton, text, zipCodeButton, zipInput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
