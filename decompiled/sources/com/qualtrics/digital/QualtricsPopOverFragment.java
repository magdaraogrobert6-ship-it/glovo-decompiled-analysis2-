package com.qualtrics.digital;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.qualtrics.digital.theming.fonts.FontTheme;
import com.qualtrics.digital.theming.prompt.MobileAppPromptTheme;
import io.sentry.android.core.SentryLogcatAdapter;
import o.onTrimMemory;

/* JADX INFO: loaded from: classes4.dex */
public class QualtricsPopOverFragment extends Fragment {
    public static final String CLOSE_DIALOG = "Close Dialog";
    private static final String CREATIVE_DEFINITION_KEY = "CREATIVE_DEFINITION";
    private static final String CREATIVE_THEME_KEY = "CREATIVE_THEME";
    private static final int DIALOG_WIDTH = 260;
    private static final String WIDTH_KEY = "WIDTH";
    OnCreativeButtonPressedListener mButtonPressListener;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnCreativeButtonPressedListener {
        void onCreativeButtonPressed(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setButtonPressListener(Context context) {
        try {
            this.mButtonPressListener = (OnCreativeButtonPressedListener) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.toString() + " must implement OnCreativeButtonPressListener");
        }
    }

    private boolean shouldShowCloseButton(Buttons buttons) {
        return buttons.hasCloseButton();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    private boolean areButtonsMultiline(int i, TextView textView, PopOverCreative popOverCreative) {
        byte b;
        Paint paint = new Paint();
        paint.setTextSize(textView.getTextSize());
        float fMeasureText = paint.measureText(popOverCreative.CreativeDefinition.Options.Buttons.ButtonOne.Text);
        Buttons buttons = popOverCreative.CreativeDefinition.Options.Buttons;
        if (buttons.Number != 2) {
            return false;
        }
        float fMeasureText2 = paint.measureText(buttons.ButtonTwo.Text);
        String str = popOverCreative.CreativeDefinition.Options.Buttons.ButtonStyle;
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 3154575) {
            if (iHashCode != 3321850) {
                if (iHashCode == 1312628413 && str.equals("standard")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("link")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("full")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            float fConvertDpToPixel = (i / 2) - (convertDpToPixel(16.0f) * 2);
            return fMeasureText >= fConvertDpToPixel || fMeasureText2 >= fConvertDpToPixel;
        }
        if (b == 1) {
            return (fMeasureText + fMeasureText2) + ((float) (convertDpToPixel(20.0f) * 2)) > ((float) i);
        }
        if (b != 2) {
            return false;
        }
        return (fMeasureText + fMeasureText2) + ((float) (convertDpToPixel(20.0f) + ((convertDpToPixel(16.0f) * 4) + (convertDpToPixel(20.0f) * 2)))) > ((float) i);
    }

    private void buildCloseButton(LinearLayout linearLayout, PopOverCreative popOverCreative) {
        if (!shouldShowCloseButton(popOverCreative.CreativeDefinition.Options.Buttons)) {
            linearLayout.setShowDividers(3);
            return;
        }
        linearLayout.setShowDividers(2);
        LinearLayout linearLayout2 = new LinearLayout(getActivity());
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = convertDpToPixel(20.0f);
        layoutParams.rightMargin = convertDpToPixel(20.0f);
        linearLayout2.setLayoutParams(layoutParams);
        View view = new View(getActivity());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        view.setLayoutParams(layoutParams2);
        linearLayout2.addView(view);
        Buttons buttons = popOverCreative.CreativeDefinition.Options.Buttons;
        String str = buttons.CloseButtonColor;
        String str2 = buttons.CloseButtonBackgroundColor;
        ImageView imageView = new ImageView(getActivity());
        imageView.setContentDescription(CLOSE_DIALOG);
        imageView.setId(R.id.dialogCloseButton);
        imageView.setImageResource(R.drawable.ic_close_black_24dp);
        imageView.setColorFilter(Color.parseColor(str));
        imageView.setBackgroundColor(Color.parseColor(str2));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        imageView.setLayoutParams(layoutParams3);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.QualtricsPopOverFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                QualtricsPopOverFragment qualtricsPopOverFragment = QualtricsPopOverFragment.this;
                OnCreativeButtonPressedListener onCreativeButtonPressedListener = qualtricsPopOverFragment.mButtonPressListener;
                if (onCreativeButtonPressedListener != null) {
                    onCreativeButtonPressedListener.onCreativeButtonPressed("negative");
                } else {
                    qualtricsPopOverFragment.getActivity().finish();
                }
            }
        });
        linearLayout2.addView(imageView);
        linearLayout.addView(linearLayout2);
    }

    private LinearLayout getButtonLayout(boolean z, int i) {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iConvertDpToPixel = convertDpToPixel(25.0f);
        layoutParams.topMargin = (iConvertDpToPixel / 2) + i;
        if (!z) {
            layoutParams.bottomMargin = iConvertDpToPixel;
        }
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private RelativeLayout getDialogContainer(PopOverCreative popOverCreative) {
        RelativeLayout relativeLayout = new RelativeLayout(getActivity());
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(popOverCreative.CreativeDefinition.Options.SizeAndStyle.getShadowBoxColor());
        relativeLayout.setClipToOutline(true);
        return relativeLayout;
    }

    private int getDialogWidth(int i) {
        int iConvertDpToPixel = convertDpToPixel(260.0f);
        return i < iConvertDpToPixel - convertDpToPixel(40.0f) ? i - convertDpToPixel(40.0f) : iConvertDpToPixel;
    }

    private TextView getMessageDescription(int i, TextView textView, PopOverCreative popOverCreative, FontTheme fontTheme) {
        TextView textView2 = new TextView(getActivity());
        textView2.setContentDescription(popOverCreative.CreativeDefinition.Options.Description.Text);
        textView2.setId(R.id.popOverDescription);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = convertDpToPixel(20.0f);
        layoutParams.rightMargin = convertDpToPixel(20.0f);
        int i2 = i / 2;
        layoutParams.topMargin = i2;
        layoutParams.bottomMargin = i2;
        textView2.setLayoutParams(layoutParams);
        textView2.setText(popOverCreative.CreativeDefinition.Options.Description.Text);
        textView2.setTextColor(Color.parseColor(popOverCreative.CreativeDefinition.Options.Description.Color));
        if (fontTheme != null) {
            textView2.setTypeface(getTypefaceForFontRes(fontTheme.getFontRes()));
            textView2.setTextSize(2, fontTheme.getSize());
        } else {
            textView2.setTextSize(2, popOverCreative.CreativeDefinition.Options.Description.getTextSize());
            if (popOverCreative.CreativeDefinition.Options.Description.Bold) {
                textView2.setTypeface(textView.getTypeface(), 1);
            }
        }
        textView2.setTextAlignment(popOverCreative.CreativeDefinition.Options.Description.getAlignment());
        return textView2;
    }

    private TextView getMessageTitle(PopOverCreative popOverCreative, FontTheme fontTheme) {
        TextView textView = new TextView(getActivity());
        textView.setContentDescription(popOverCreative.CreativeDefinition.Options.Title.Text);
        textView.setId(R.id.popOverTitle);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = convertDpToPixel(20.0f);
        layoutParams.rightMargin = convertDpToPixel(20.0f);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setText(popOverCreative.CreativeDefinition.Options.Title.Text);
        textView.setTextColor(Color.parseColor(popOverCreative.CreativeDefinition.Options.Title.Color));
        if (fontTheme != null) {
            textView.setTypeface(getTypefaceForFontRes(fontTheme.getFontRes()));
            textView.setTextSize(2, fontTheme.getSize());
            textView.setTypeface(textView.getTypeface(), 1);
        } else {
            textView.setTextSize(2, popOverCreative.CreativeDefinition.Options.Title.getTextSize());
            if (popOverCreative.CreativeDefinition.Options.Title.Bold) {
                textView.setTypeface(textView.getTypeface(), 1);
            }
        }
        textView.setTextAlignment(popOverCreative.CreativeDefinition.Options.Title.getAlignment());
        return textView;
    }

    private Typeface getTypefaceForFontRes(int i) {
        return i == 0 ? Typeface.DEFAULT : getResources().getFont(i);
    }

    public static QualtricsPopOverFragment newInstance(String str, int i, String str2) {
        QualtricsPopOverFragment qualtricsPopOverFragment = new QualtricsPopOverFragment();
        Bundle bundle = new Bundle();
        bundle.putString(CREATIVE_DEFINITION_KEY, str);
        bundle.putString(CREATIVE_THEME_KEY, str2);
        bundle.putInt(WIDTH_KEY, i);
        qualtricsPopOverFragment.setArguments(bundle);
        return qualtricsPopOverFragment;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = getArguments().getString(CREATIVE_DEFINITION_KEY);
        String string2 = getArguments().getString(CREATIVE_THEME_KEY);
        if (string == null) {
            SentryLogcatAdapter.serializer("Qualtrics", "Error getting creative definition in pop over fragment. Display aborted.");
            return null;
        }
        int i = getArguments().getInt(WIDTH_KEY);
        Gson gson = new Gson();
        PopOverCreative popOverCreative = (PopOverCreative) gson.fromJson(string, PopOverCreative.class);
        MobileAppPromptTheme mobileAppPromptTheme = (MobileAppPromptTheme) gson.fromJson(string2, MobileAppPromptTheme.class);
        RelativeLayout dialogContainer = getDialogContainer(popOverCreative);
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setId(R.id.popOverBody);
        int dialogWidth = getDialogWidth(i);
        convertDpToPixel(16.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor(popOverCreative.CreativeDefinition.Options.Divider.Color));
        shapeDrawable.setIntrinsicHeight(convertDpToPixel(popOverCreative.CreativeDefinition.Options.SizeAndStyle.getContentSpacing()));
        shapeDrawable.setIntrinsicWidth(dialogWidth);
        linearLayout.setDividerDrawable(shapeDrawable);
        buildDialogLayout(linearLayout, dialogWidth, popOverCreative);
        dialogContainer.addView(linearLayout);
        buildCloseButton(linearLayout, popOverCreative);
        TextView messageTitle = getMessageTitle(popOverCreative, mobileAppPromptTheme != null ? mobileAppPromptTheme.getHeadlineFont() : null);
        buildMessageSection(linearLayout, messageTitle, getMessageDescription(convertDpToPixel(18.0f), messageTitle, popOverCreative, mobileAppPromptTheme != null ? mobileAppPromptTheme.getDescriptionFont() : null));
        LinearLayout buttonLayout = getButtonLayout(popOverCreative.CreativeDefinition.Options.Buttons.ButtonStyle.equals("full"), shapeDrawable.getIntrinsicHeight());
        LinearLayout linearLayout2 = new LinearLayout(getActivity());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(getActivity());
        textView.setTextSize(2, 18.0f);
        textView.setText(popOverCreative.CreativeDefinition.Options.Buttons.ButtonOne.Text);
        boolean zAreButtonsMultiline = areButtonsMultiline(dialogWidth, textView, popOverCreative);
        if (zAreButtonsMultiline) {
            buttonLayout.setOrientation(1);
        }
        linearLayout2.addView(buttonLayout);
        Buttons buttons = popOverCreative.CreativeDefinition.Options.Buttons;
        View viewConfigureButton = configureButton(textView, buttons, buttons.ButtonOne, zAreButtonsMultiline, true, buttonLayout, mobileAppPromptTheme != null ? mobileAppPromptTheme.getButtonOneTheme().getFont() : null);
        viewConfigureButton.setContentDescription(popOverCreative.CreativeDefinition.Options.Buttons.ButtonOne.Text + " button");
        viewConfigureButton.setId(R.id.popOverButtonOne);
        if (popOverCreative.CreativeDefinition.Options.Buttons.Number == 2) {
            TextView textView2 = new TextView(getActivity());
            textView2.setContentDescription(popOverCreative.CreativeDefinition.Options.Buttons.ButtonTwo.Text + " button");
            textView2.setId(R.id.popOverButtonTwo);
            textView2.setText(popOverCreative.CreativeDefinition.Options.Buttons.ButtonTwo.Text);
            Buttons buttons2 = popOverCreative.CreativeDefinition.Options.Buttons;
            View viewConfigureButton2 = configureButton(textView2, buttons2, buttons2.ButtonTwo, zAreButtonsMultiline, false, buttonLayout, mobileAppPromptTheme != null ? mobileAppPromptTheme.getButtonTwoTheme().getFont() : null);
            if (zAreButtonsMultiline) {
                buttonLayout.addView(viewConfigureButton2);
                buttonLayout.addView(viewConfigureButton);
            } else {
                buttonLayout.addView(viewConfigureButton);
                buttonLayout.addView(viewConfigureButton2);
            }
        } else {
            buttonLayout.addView(viewConfigureButton);
        }
        linearLayout.addView(linearLayout2);
        return dialogContainer;
    }

    private void buildDialogLayout(LinearLayout linearLayout, int i, PopOverCreative popOverCreative) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, -2);
        layoutParams.addRule(13);
        layoutParams.topMargin = convertDpToPixel(40.0f);
        layoutParams.bottomMargin = convertDpToPixel(40.0f);
        linearLayout.setPadding(0, convertDpToPixel(16.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(popOverCreative.CreativeDefinition.Options.SizeAndStyle.InterceptColor));
        gradientDrawable.setCornerRadius(convertDpToPixel(popOverCreative.CreativeDefinition.Options.SizeAndStyle.BorderRadius));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setElevation(popOverCreative.CreativeDefinition.Options.SizeAndStyle.getDropShadow());
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        setButtonPressListener(activity);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        onTrimMemory supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.IconCompatParcelizer();
        }
    }

    public int convertDpToPixel(float f) {
        return DisplayUtils.convertDpToPixel(f, getResources());
    }

    private void buildMessageSection(LinearLayout linearLayout, TextView textView, TextView textView2) {
        if (!textView.getText().equals("")) {
            linearLayout.addView(textView);
        }
        if (textView2.getText().equals("")) {
            return;
        }
        linearLayout.addView(textView2);
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        setButtonPressListener(context);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    private TextView configureButton(TextView textView, Buttons buttons, final ButtonOptions buttonOptions, boolean z, boolean z2, LinearLayout linearLayout, FontTheme fontTheme) {
        byte b;
        if (buttons.ButtonStyle.equals("link")) {
            textView.setTextColor(Color.parseColor(buttonOptions.Color));
            textView.setTypeface(textView.getTypeface(), 1);
            String str = buttons.LinkAlignment;
            if (str != null) {
                str.getClass();
                int iHashCode = str.hashCode();
                if (iHashCode != -1364013995) {
                    if (iHashCode != 3317767) {
                        if (iHashCode == 108511772 && str.equals("right")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("left")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("center")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    textView.setGravity(17);
                    linearLayout.setGravity(17);
                } else if (b == 1) {
                    textView.setGravity(3);
                    linearLayout.setGravity(3);
                } else if (b == 2) {
                    textView.setGravity(5);
                    linearLayout.setGravity(5);
                }
            } else {
                textView.setTextAlignment(4);
                textView.setGravity(17);
                linearLayout.setGravity(17);
            }
        } else {
            textView.setTextColor(Color.parseColor(buttonOptions.Color));
            textView.setTextAlignment(4);
            textView.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor(buttonOptions.BackgroundColor));
            if (buttons.ButtonStyle.equals("full")) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                if (buttonOptions.BorderColor != null) {
                    shapeDrawable.getPaint().setColor(Color.parseColor(buttonOptions.BorderColor));
                } else {
                    shapeDrawable.getPaint().setColor(Color.parseColor(buttonOptions.BackgroundColor));
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, gradientDrawable});
                layerDrawable.setLayerInset(0, 0, 0, 0, 0);
                layerDrawable.setLayerInset(1, 0, 3, 0, 0);
                textView.setBackground(layerDrawable);
            } else {
                String str2 = buttonOptions.BorderColor;
                if (str2 != null) {
                    gradientDrawable.setStroke(3, Color.parseColor(str2));
                }
                gradientDrawable.setCornerRadius(convertDpToPixel(buttons.BorderRadius));
                textView.setBackground(gradientDrawable);
            }
            textView.setGravity(17);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        int iConvertDpToPixel = convertDpToPixel(20.0f);
        if (!buttons.ButtonStyle.equals("full")) {
            layoutParams.width = -2;
            if (!z && buttons.Number != 1) {
                layoutParams.leftMargin = z2 ? iConvertDpToPixel : 0;
                layoutParams.rightMargin = z2 ? convertDpToPixel(16.0f) : iConvertDpToPixel;
                if (buttons.ButtonStyle.equals("link")) {
                    layoutParams.rightMargin = iConvertDpToPixel;
                }
            } else {
                layoutParams.width = -1;
                layoutParams.leftMargin = iConvertDpToPixel;
                layoutParams.rightMargin = iConvertDpToPixel;
                if (!z2) {
                    layoutParams.bottomMargin = convertDpToPixel(8.0f);
                }
            }
            if (buttons.ButtonStyle.equals("standard")) {
                layoutParams.weight = 1.0f;
                textView.setMinimumWidth(convertDpToPixel(35.0f));
            }
        } else if (z) {
            layoutParams.width = -1;
        } else {
            layoutParams.weight = 1.0f;
        }
        if (fontTheme != null) {
            if (fontTheme.hasCustomTypeface()) {
                textView.setTypeface(getTypefaceForFontRes(fontTheme.getFontRes()));
            }
            textView.setTextSize(2, fontTheme.getSize());
        } else {
            textView.setTextSize(2, 18.0f);
        }
        textView.setLayoutParams(layoutParams);
        float f = buttons.ButtonStyle.equals("link") ? 0 : 16;
        textView.setPadding(convertDpToPixel(f), 27, convertDpToPixel(f), 27);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.QualtricsPopOverFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QualtricsPopOverFragment qualtricsPopOverFragment = QualtricsPopOverFragment.this;
                OnCreativeButtonPressedListener onCreativeButtonPressedListener = qualtricsPopOverFragment.mButtonPressListener;
                if (onCreativeButtonPressedListener != null) {
                    onCreativeButtonPressedListener.onCreativeButtonPressed(buttonOptions.Action);
                } else {
                    qualtricsPopOverFragment.getActivity().finish();
                }
            }
        });
        return textView;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
