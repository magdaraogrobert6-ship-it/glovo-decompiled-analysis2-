package com.qualtrics.digital;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import com.qualtrics.digital.theming.embedded.EmbeddedAppFeedbackTheme;
import com.qualtrics.digital.theming.fonts.FontTheme;
import io.sentry.android.core.SentryLogcatAdapter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.PlaceableKt;
import o.setPrevious;

/* JADX INFO: loaded from: classes5.dex */
class EmbeddedFeedbackOrchestrator {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static byte write = -112;
    String actionSetID;
    final ClientCallbackUtils clientCallbackUtils;
    Context context;
    String creativeID;
    String currentLangCode;
    EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme;
    String[] fivePointQuestionDescriptions;
    EmbeddedFeedbackCreativeQuestion followupQuestion;
    PlaceableKt followupQuestionDialog;
    EmbeddedFeedbackCreativeQuestion initialQuestion;
    PlaceableKt initialQuestionDialog;
    String interceptID;
    int[] multipleChoiceIds;
    EmbeddedFeedbackCreativeQuestion multipleChoiceQuestion;
    List<RadioButton> multipleChoiceRadioButtons;
    int noButtonWidth;
    EmbeddedFeedbackCreativeOptions options;
    EmbeddedFeedbackResponseManager responseManager;
    int screenHeight;
    int screenWidth;
    SiteInterceptService siteInterceptService;
    PlaceableKt thankYouMessageDialog;
    ThemeApplier themeApplier;
    ThemingUtils themingUtils;
    String[] thumbsDescriptions;
    int yesButtonWidth;
    int[] fivePointQuestionIconIds = {R.id.extremely_unhelpful, R.id.somewhat_unhelpful, R.id.neither_helpful_nor_unhelpful, R.id.somewhat_helpful, R.id.extremely_helpful};
    int[] thumbsButtonIDs = {R.id.thumbs_up, R.id.thumbs_down};
    int[] textButtonIDs = {R.id.yes_button, R.id.no_button};

    private void addEmojisToDialogView() {
        LinearLayout linearLayout = (LinearLayout) this.initialQuestionDialog.findViewById(R.id.icon_view);
        for (final int i = 0; i < this.fivePointQuestionDescriptions.length; i++) {
            boolean zEquals = this.options.Questions.get(0).Appearance.Style.equals(EmbeddedFeedbackUtils.QUESTION_STYLE_DEFAULT);
            String[] strArr = this.fivePointQuestionDescriptions;
            ImageButton defaultEmojiButton = zEquals ? getDefaultEmojiButton(linearLayout, EmbeddedFeedbackUtils.getFivePointChoiceTranslation(i, strArr[i], this.currentLangCode), EmbeddedFeedbackUtils.FIVE_POINT_QUESTION_OPTIONS[i]) : getCustomEmojiButton(linearLayout, EmbeddedFeedbackUtils.getFivePointChoiceTranslation(i, strArr[i], this.currentLangCode), EmbeddedFeedbackUtils.FIVE_POINT_QUESTION_OPTIONS[i]);
            defaultEmojiButton.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EmbeddedFeedbackOrchestrator.this.onInitialQuestionAnswered(i);
                }
            });
            defaultEmojiButton.setId(this.fivePointQuestionIconIds[i]);
            linearLayout.addView(defaultEmojiButton);
        }
        linearLayout.setGravity(17);
    }

    private void addStarsToDialogView() {
        LinearLayout linearLayout = (LinearLayout) this.initialQuestionDialog.findViewById(R.id.icon_view);
        final int i = 0;
        while (true) {
            String[] strArr = this.fivePointQuestionDescriptions;
            if (i >= strArr.length) {
                linearLayout.setGravity(17);
                return;
            }
            ImageButton starButton = getStarButton(linearLayout, EmbeddedFeedbackUtils.getFivePointChoiceTranslation(i, strArr[i], this.currentLangCode));
            starButton.setId(this.fivePointQuestionIconIds[i]);
            starButton.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EmbeddedFeedbackOrchestrator.this.onInitialQuestionAnswered(i);
                }
            });
            linearLayout.addView(starButton);
            i++;
        }
    }

    private void addThumbsToDialogView() {
        LinearLayout linearLayout = (LinearLayout) this.initialQuestionDialog.findViewById(R.id.icon_view);
        linearLayout.setGravity(17);
        ImageButton imageButtonCreateThumbButton = createThumbButton(linearLayout, EmbeddedFeedbackUtils.getThumbsUpTranslation(this.thumbsDescriptions[0], this.currentLangCode), EmbeddedFeedbackUtils.THUMBS_UP);
        imageButtonCreateThumbButton.setId(this.thumbsButtonIDs[0]);
        imageButtonCreateThumbButton.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EmbeddedFeedbackOrchestrator.this.onInitialQuestionAnswered(0);
            }
        });
        linearLayout.addView(imageButtonCreateThumbButton);
        ImageButton imageButtonCreateThumbButton2 = createThumbButton(linearLayout, EmbeddedFeedbackUtils.getThumbsDownTranslation(this.thumbsDescriptions[1], this.currentLangCode), EmbeddedFeedbackUtils.THUMBS_DOWN);
        imageButtonCreateThumbButton2.setId(this.thumbsButtonIDs[1]);
        imageButtonCreateThumbButton2.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EmbeddedFeedbackOrchestrator.this.onInitialQuestionAnswered(1);
            }
        });
        linearLayout.addView(imageButtonCreateThumbButton2);
    }

    private void addYesNoButtonsToDialogView() {
        LinearLayout linearLayout = (LinearLayout) this.initialQuestionDialog.findViewById(R.id.icon_view);
        linearLayout.setGravity(17);
        final Button buttonCreateYesNoButton = createYesNoButton(linearLayout, EmbeddedFeedbackUtils.getTranslation(this.options.Questions.get(0).Choices.get(0).Display, this.options.Translations, this.currentLangCode, EmbeddedFeedbackUtils.YES_BUTTON_KEY), true);
        buttonCreateYesNoButton.setId(this.textButtonIDs[0]);
        buttonCreateYesNoButton.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EmbeddedFeedbackOrchestrator.this.onInitialQuestionAnswered(0);
            }
        });
        final Button buttonCreateYesNoButton2 = createYesNoButton(linearLayout, EmbeddedFeedbackUtils.getTranslation(this.options.Questions.get(0).Choices.get(1).Display, this.options.Translations, this.currentLangCode, EmbeddedFeedbackUtils.NO_BUTTON_KEY), false);
        buttonCreateYesNoButton2.setId(this.textButtonIDs[1]);
        buttonCreateYesNoButton2.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EmbeddedFeedbackOrchestrator.this.onInitialQuestionAnswered(1);
            }
        });
        buttonCreateYesNoButton.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                EmbeddedFeedbackOrchestrator.this.yesButtonWidth = buttonCreateYesNoButton.getWidth();
                buttonCreateYesNoButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        buttonCreateYesNoButton2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                EmbeddedFeedbackOrchestrator.this.noButtonWidth = buttonCreateYesNoButton2.getWidth();
                EmbeddedFeedbackOrchestrator embeddedFeedbackOrchestrator = EmbeddedFeedbackOrchestrator.this;
                int i = embeddedFeedbackOrchestrator.yesButtonWidth;
                int i2 = embeddedFeedbackOrchestrator.noButtonWidth;
                if (i > i2) {
                    buttonCreateYesNoButton2.setWidth(i);
                } else {
                    buttonCreateYesNoButton.setWidth(i2);
                }
                buttonCreateYesNoButton2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        linearLayout.addView(buttonCreateYesNoButton);
        linearLayout.addView(buttonCreateYesNoButton2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeDialog(PlaceableKt placeableKt, boolean z) {
        if (z) {
            checkAndSubmitResponse();
        }
        if (placeableKt != null) {
            placeableKt.cancel();
        }
    }

    private void configureCloseButton(View view, final PlaceableKt placeableKt, final boolean z) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.close_button);
        int closeButtonColor = this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options) ? this.embeddedAppFeedbackTheme.getCloseButtonColor(this.themingUtils) : this.context.getColor(R.color.qualtricsDefaultCloseButton);
        int closeButtonBackgroundColor = this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options) ? this.embeddedAppFeedbackTheme.getCloseButtonBackgroundColor(this.themingUtils) : 0;
        imageButton.setColorFilter(closeButtonColor, PorterDuff.Mode.SRC_ATOP);
        imageButton.setBackgroundColor(closeButtonBackgroundColor);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                EmbeddedFeedbackOrchestrator.this.closeDialog(placeableKt, z);
                EmbeddedFeedbackOrchestrator.this.notifyListenerOfDialogClose();
            }
        });
        imageButton.setContentDescription(EmbeddedFeedbackUtils.getCloseTranslation("Close", this.currentLangCode));
    }

    private void configureFollowupQuestionLookAndFeelViews(View view, EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion) {
        String translation = EmbeddedFeedbackUtils.getTranslation(embeddedFeedbackCreativeQuestion.QuestionText, this.options.Translations, this.currentLangCode, EmbeddedFeedbackUtils.FOLLOW_UP_QUESTION_KEY);
        TextView textView = (TextView) view.findViewById(R.id.followup_question_text);
        FontTheme followupQuestionFont = shouldThemeFonts(this.options, this.embeddedAppFeedbackTheme) ? this.embeddedAppFeedbackTheme.getFollowupQuestionTheme().getFollowupQuestionFont() : null;
        if (followupQuestionFont != null) {
            if (followupQuestionFont.hasCustomTypeface()) {
                setTypefaceIfSupported(textView, followupQuestionFont.getFontRes());
            } else {
                textView.setTypeface(null, 1);
            }
            textView.setTextSize(2, followupQuestionFont.getSize());
        } else {
            textView.setTypeface(null, 1);
        }
        textView.setText(translation);
        textView.setTextColor(Color.parseColor(embeddedFeedbackCreativeQuestion.Appearance.QuestionTextColor));
        textView.setContentDescription(translation);
        textView.setVisibility(0);
        EditText editText = (EditText) view.findViewById(R.id.open_text_input);
        editText.setImeOptions(6);
        editText.setRawInputType(1);
        int color = this.context.getColor(R.color.qualtricsDefaultTextInput);
        int color2 = this.context.getColor(R.color.qualtricsDefaultTextInputBackground);
        if (this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options)) {
            color = this.embeddedAppFeedbackTheme.getTextInputTheme().getMultilineTextInputColor(this.themingUtils);
            color2 = this.embeddedAppFeedbackTheme.getTextInputTheme().getMultilineTextInputBackgroundColor(this.themingUtils);
        }
        editText.setTextColor(color);
        editText.getBackground().setColorFilter(color2, PorterDuff.Mode.SRC_ATOP);
        editText.setHint(translation);
        FontTheme followupQuestionTextInputFont = shouldThemeFonts(this.options, this.embeddedAppFeedbackTheme) ? this.embeddedAppFeedbackTheme.getFollowupQuestionTheme().getFollowupQuestionTextInputFont() : null;
        if (followupQuestionTextInputFont != null) {
            if (followupQuestionTextInputFont.hasCustomTypeface()) {
                setTypefaceIfSupported(editText, followupQuestionTextInputFont.getFontRes());
            }
            editText.setTextSize(2, followupQuestionTextInputFont.getSize());
        }
        editText.setVisibility(0);
    }

    private int convertDpToPixel(float f) {
        return DisplayUtils.convertDpToPixel(f, this.context.getResources());
    }

    private ImageButton createThumbButton(View view, String str, String str2) {
        int color = Color.parseColor(this.options.Questions.get(0).Appearance.ThumbUpBorderColor);
        int color2 = Color.parseColor(this.options.Questions.get(0).Appearance.ThumbUpFillColor);
        int color3 = Color.parseColor(this.options.Questions.get(0).Appearance.ThumbDownBorderColor);
        int color4 = Color.parseColor(this.options.Questions.get(0).Appearance.ThumbDownFillColor);
        Drawable[] drawableArr = new Drawable[2];
        ImageButton imageButton = new ImageButton(view.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(convertDpToPixel(52.0f), convertDpToPixel(44.0f));
        str2.getClass();
        if (str2.equals(EmbeddedFeedbackUtils.THUMBS_DOWN)) {
            drawableArr[0] = this.context.getResources().getDrawable(R.drawable.thumbs_down_background);
            drawableArr[1] = this.context.getResources().getDrawable(R.drawable.thumbs_down_border);
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            drawable.setColorFilter(color4, mode);
            drawableArr[1].setColorFilter(color3, mode);
        } else if (str2.equals(EmbeddedFeedbackUtils.THUMBS_UP)) {
            drawableArr[0] = this.context.getResources().getDrawable(R.drawable.thumbs_up_background);
            drawableArr[1] = this.context.getResources().getDrawable(R.drawable.thumbs_up_border);
            Drawable drawable2 = drawableArr[0];
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_ATOP;
            drawable2.setColorFilter(color2, mode2);
            drawableArr[1].setColorFilter(color, mode2);
            layoutParams.setMargins(0, 0, convertDpToPixel(32.0f), 0);
        }
        imageButton.setContentDescription(str);
        imageButton.setImageDrawable(new LayerDrawable(drawableArr));
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
        imageButton.setLayoutParams(layoutParams);
        imageButton.setBackgroundColor(0);
        return imageButton;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void displayIcons() {
        byte b = 0;
        String str = this.options.Questions.get(0).Style;
        str.getClass();
        switch (str.hashCode()) {
            case -2138069019:
                if (!str.equals(EmbeddedFeedbackUtils.QUESTION_STYLE_YES_NO)) {
                    b = -1;
                }
                break;
            case 1991005960:
                if (!str.equals(EmbeddedFeedbackUtils.QUESTION_STYLE_EMOJI)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 2004130595:
                if (!str.equals(EmbeddedFeedbackUtils.QUESTION_STYLE_STARS)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 2016643803:
                if (!str.equals(EmbeddedFeedbackUtils.QUESTION_STYLE_THUMBS)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            addYesNoButtonsToDialogView();
            return;
        }
        if (b == 1) {
            addEmojisToDialogView();
            return;
        }
        if (b == 2) {
            addStarsToDialogView();
        } else if (b != 3) {
            QualtricsLog.logError("Qualtrics: Invalid question style");
        } else {
            addThumbsToDialogView();
        }
    }

    private void displayInitialQuestion() {
        EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion = this.options.Questions.get(0);
        this.initialQuestion = embeddedFeedbackCreativeQuestion;
        String translation = EmbeddedFeedbackUtils.getTranslation(embeddedFeedbackCreativeQuestion.QuestionText, this.options.Translations, this.currentLangCode, EmbeddedFeedbackUtils.MAIN_QUESTION_KEY);
        PlaceableKt placeableKt = new PlaceableKt(this.context, R.style.BottomSheetDialog);
        this.initialQuestionDialog = placeableKt;
        placeableKt.setCancelable(false);
        View viewInflate = ((Activity) this.context).getLayoutInflater().inflate(R.layout.embedded_feedback_initial_question, (ViewGroup) null);
        configureCloseButton(viewInflate, this.initialQuestionDialog, false);
        Drawable drawable = this.context.getDrawable(R.drawable.embedded_feedback_modal_border);
        drawable.setColorFilter(new PorterDuffColorFilter(this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options) ? this.embeddedAppFeedbackTheme.getDialogBackgroundColor(this.themingUtils) : this.context.getColor(R.color.qualtricsDefaultBackground), PorterDuff.Mode.SRC_IN));
        viewInflate.setBackground(drawable);
        TextView textView = (TextView) viewInflate.findViewById(R.id.question_text);
        FontTheme initialQuestion = shouldThemeFonts(this.options, this.embeddedAppFeedbackTheme) ? this.embeddedAppFeedbackTheme.getInitialQuestionTheme().getInitialQuestion() : null;
        if (initialQuestion != null) {
            if (initialQuestion.hasDefaultTypeface()) {
                textView.setTypeface(null, 1);
            } else {
                setTypefaceIfSupported(textView, initialQuestion.getFontRes());
            }
            textView.setTextSize(2, initialQuestion.getSize());
        } else {
            textView.setTypeface(null, 1);
        }
        textView.setText(translation);
        textView.setTextColor(Color.parseColor(this.options.Questions.get(0).Appearance.QuestionTextColor));
        textView.setContentDescription(translation);
        textView.setLayoutParams(getInitialQuestionLayoutParams());
        this.initialQuestionDialog.setContentView(viewInflate);
        this.initialQuestionDialog.setTitle(R.string.qualtrics_dialog_text);
        viewInflate.measure(0, 0);
        if (viewInflate.getMeasuredHeight() < ((double) this.screenHeight) * 0.3d) {
            viewInflate.getLayoutParams().height = (this.screenHeight * 30) / 100;
            viewInflate.requestLayout();
        }
        showAlertDialog(this.initialQuestionDialog);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    private ImageButton getCustomEmojiButton(View view, String str, String str2) {
        byte b;
        ImageButton imageButton = new ImageButton(view.getContext());
        Drawable[] drawableArr = new Drawable[2];
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setSize(convertDpToPixel(40.0f), convertDpToPixel(40.0f));
        gradientDrawable.setStroke(convertDpToPixel(2.0f), Color.parseColor(this.options.Questions.get(0).Appearance.EmojiBorderColor));
        gradientDrawable.setColor(Color.parseColor(this.options.Questions.get(0).Appearance.EmojiFillColor));
        drawableArr[0] = gradientDrawable;
        str2.getClass();
        switch (str2) {
            case "ExtremelyHelpful":
                b = 0;
                break;
            case "SomewhatHelpful":
                b = 1;
                break;
            case "NeitherHelpfulNorUnhelpful":
                b = 2;
                break;
            case "ExtremelyUnhelpful":
                b = 3;
                break;
            case "SomewhatUnhelpful":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            drawableArr[1] = this.context.getResources().getDrawable(R.drawable.extremely_helpful_custom_emoji);
        } else if (b == 1) {
            drawableArr[1] = this.context.getResources().getDrawable(R.drawable.somewhat_helpful_custom_emoji);
        } else if (b == 2) {
            drawableArr[1] = this.context.getResources().getDrawable(R.drawable.neither_helpful_nor_unhelpful_custom_emoji);
        } else if (b == 3) {
            drawableArr[1] = this.context.getResources().getDrawable(R.drawable.extremely_unhelpful_custom_emoji);
        } else if (b != 4) {
            QualtricsLog.logError("Invalid buttonType received for custom emoji");
        } else {
            drawableArr[1] = this.context.getResources().getDrawable(R.drawable.somewhat_unhelpful_custom_emoji);
        }
        drawableArr[1].setColorFilter(Color.parseColor(this.options.Questions.get(0).Appearance.EmojiTintColor), PorterDuff.Mode.SRC_ATOP);
        imageButton.setContentDescription(str);
        imageButton.setImageDrawable(new LayerDrawable(drawableArr));
        imageButton.setPadding(0, 0, (this.screenWidth * 5) / 100, 0);
        imageButton.setBackgroundColor(0);
        return imageButton;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    private ImageButton getDefaultEmojiButton(View view, String str, String str2) {
        byte b;
        ImageButton imageButton = new ImageButton(view.getContext());
        str2.getClass();
        switch (str2) {
            case "ExtremelyHelpful":
                b = 0;
                break;
            case "SomewhatHelpful":
                b = 1;
                break;
            case "NeitherHelpfulNorUnhelpful":
                b = 2;
                break;
            case "ExtremelyUnhelpful":
                b = 3;
                break;
            case "SomewhatUnhelpful":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            imageButton.setImageResource(R.drawable.extremely_helpful_default_emoji);
        } else if (b == 1) {
            imageButton.setImageResource(R.drawable.somewhat_helpful_default_emoji);
        } else if (b == 2) {
            imageButton.setImageResource(R.drawable.neither_helpful_nor_unhelpful_default_emoji);
        } else if (b == 3) {
            imageButton.setImageResource(R.drawable.extremely_unhelpful_default_emoji);
        } else if (b != 4) {
            QualtricsLog.logError("Invalid buttonType received for default emoji");
        } else {
            imageButton.setImageResource(R.drawable.somewhat_unhelpful_default_emoji);
        }
        imageButton.setContentDescription(str);
        imageButton.setPadding(0, 0, (this.screenWidth * 5) / 100, 0);
        imageButton.setBackgroundColor(0);
        return imageButton;
    }

    private ImageButton getStarButton(View view, String str) {
        int color = Color.parseColor(this.options.Questions.get(0).Appearance.StarsColor);
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = this.context.getResources().getDrawable(R.drawable.star_fill);
        int dialogBackgroundColor = this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options) ? this.embeddedAppFeedbackTheme.getDialogBackgroundColor(this.themingUtils) : this.context.getColor(R.color.qualtricsDefaultBackground);
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawable.setColorFilter(dialogBackgroundColor, mode);
        Drawable drawable2 = this.context.getResources().getDrawable(R.drawable.star_border);
        drawableArr[1] = drawable2;
        drawable2.setColorFilter(color, mode);
        ImageButton imageButton = new ImageButton(view.getContext());
        imageButton.setContentDescription(str);
        imageButton.setImageDrawable(new LayerDrawable(drawableArr));
        imageButton.setPadding(0, 0, (this.screenWidth * 5) / 100, 0);
        imageButton.setBackgroundColor(0);
        return imageButton;
    }

    private Typeface getTypeface(int i) {
        return i == 0 ? Typeface.DEFAULT : this.context.getResources().getFont(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListenerOfDialogClose() {
        this.clientCallbackUtils.callEmbeddedFeedbackOnCloseListener();
        Activity activity = (Activity) this.context;
        if (activity instanceof QualtricsEmbeddedFeedbackActivity) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void onInitialQuestionAnswered(int i) {
        byte b;
        this.siteInterceptService.recordClick(this.interceptID, this.creativeID, this.actionSetID);
        EmbeddedFeedbackResponseManager embeddedFeedbackResponseManager = this.responseManager;
        String str = this.initialQuestion.SurveyQuestionId;
        StringBuilder sb = new StringBuilder();
        sb.append(i + 1);
        embeddedFeedbackResponseManager.addToResponse(str, sb.toString());
        byte b2 = 0;
        String str2 = this.options.Questions.get(0).Style;
        str2.getClass();
        switch (str2) {
            case "embedded-feedback-question-style-yes-no":
                b = 0;
                break;
            case "embedded-feedback-emoji-style-custom":
                b = 1;
                break;
            case "embedded-feedback-question-style-emoji":
                b = 2;
                break;
            case "embedded-feedback-question-style-stars":
                b = 3;
                break;
            case "embedded-feedback-question-style-thumbs":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            ((Button) this.initialQuestionDialog.findViewById(this.textButtonIDs[i])).setBackgroundColor(setPrevious.IconCompatParcelizer(0.3f, Color.parseColor(this.options.Questions.get(0).Appearance.ButtonFillColor), -16777216));
        } else if (b != 1 && b != 2) {
            if (b == 3) {
                int color = Color.parseColor(this.options.Questions.get(0).Appearance.StarsColor);
                for (int i2 = 0; i2 < i; i2++) {
                    ((LayerDrawable) ((ImageButton) this.initialQuestionDialog.findViewById(this.fivePointQuestionIconIds[i2])).getDrawable()).getDrawable(0).setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                }
            } else if (b != 4) {
                QualtricsLog.logError("Qualtrics: Invalid question style");
            }
        }
        closeDialog(this.initialQuestionDialog, false);
        String str3 = this.options.Questions.get(0).Choices.get(i).NextAction;
        str3.getClass();
        switch (str3.hashCode()) {
            case -1389789403:
                if (!str3.equals(EmbeddedFeedbackUtils.QUESTION_ID_MULTIPLE_CHOICE)) {
                    b2 = -1;
                }
                break;
            case -725698138:
                b2 = str3.equals(EmbeddedFeedbackUtils.QUESTION_ID_THANK_YOU_MESSAGE) ? (byte) 1 : (byte) -1;
                break;
            case -203093748:
                b2 = str3.equals(EmbeddedFeedbackUtils.QUESTION_ID_FOLLOW_UP_QUESTION) ? (byte) 2 : (byte) -1;
                break;
            case 69819:
                b2 = str3.equals(EmbeddedFeedbackUtils.END_QUESTIONS_TAG) ? (byte) 3 : (byte) -1;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            displayMultipleChoiceQuestion();
            return;
        }
        if (b2 == 1) {
            checkAndSubmitResponse();
            displayThankYouMessage();
        } else {
            if (b2 == 2) {
                displayFollowupQuestion();
                return;
            }
            if (b2 == 3) {
                checkAndSubmitResponse();
                notifyListenerOfDialogClose();
            } else {
                checkAndSubmitResponse();
                notifyListenerOfDialogClose();
                QualtricsLog.logError("Qualtrics: Invalid question choice");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRadioButtonClicked(int i, int i2, View view) {
        EditText editText = (EditText) view.findViewById(R.id.other_option_edit_text);
        if (editText != null) {
            editText.setEnabled(false);
            int[] iArr = this.multipleChoiceIds;
            if (i2 == iArr[iArr.length - 1]) {
                editText.setEnabled(true);
            }
        }
        for (int i3 = 0; i3 < this.multipleChoiceRadioButtons.size(); i3++) {
            RadioButton radioButton = this.multipleChoiceRadioButtons.get(i3);
            int id = radioButton.getId();
            ThemeApplier themeApplier = this.themeApplier;
            if (id == i2) {
                if (themeApplier.shouldEmbeddedFeedbackUseTheming(this.options)) {
                    radioButton.setBackgroundColor(this.embeddedAppFeedbackTheme.getMultipleChoiceTheme().getRadioButtonsTheme().getSelectedBackgroundColor(this.themingUtils));
                } else {
                    radioButton.setBackgroundColor(i);
                    radioButton.getBackground().setAlpha(50);
                }
            } else if (themeApplier.shouldEmbeddedFeedbackUseTheming(this.options)) {
                radioButton.setBackgroundColor(this.embeddedAppFeedbackTheme.getDialogBackgroundColor(this.themingUtils));
            } else {
                radioButton.setBackgroundColor(this.context.getColor(R.color.qualtricsDefaultBackground));
            }
        }
    }

    private boolean shouldThemeFonts(EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions, EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme) {
        return this.themeApplier.shouldEmbeddedFeedbackUseTheming(embeddedFeedbackCreativeOptions) && this.embeddedAppFeedbackTheme != null;
    }

    private void showAlertDialog(PlaceableKt placeableKt) {
        if (((Activity) this.context).isFinishing()) {
            SentryLogcatAdapter.serializer("Qualtrics", "Can't show alert dialog because activity is finishing");
        } else {
            placeableKt.show();
        }
    }

    public void configureMultipleChoiceQuestionViews(final View view, EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion) {
        String translation = EmbeddedFeedbackUtils.getTranslation(embeddedFeedbackCreativeQuestion.QuestionText, this.options.Translations, this.currentLangCode, EmbeddedFeedbackUtils.MULTIPLE_CHOICE_QUESTION_KEY);
        int color = Color.parseColor(this.options.Questions.get(0).Appearance.QuestionTextColor);
        final int color2 = Color.parseColor(embeddedFeedbackCreativeQuestion.Appearance.RadioButtonFillColor);
        TextView textView = (TextView) view.findViewById(R.id.multiple_choice_question_text);
        textView.setVisibility(0);
        FontTheme questionTextFont = shouldThemeFonts(this.options, this.embeddedAppFeedbackTheme) ? this.embeddedAppFeedbackTheme.getMultipleChoiceTheme().getQuestionTextFont() : null;
        if (questionTextFont != null) {
            if (questionTextFont.hasDefaultTypeface()) {
                textView.setTypeface(null, 1);
            } else {
                setTypefaceIfSupported(textView, questionTextFont.getFontRes());
            }
            textView.setTextSize(2, questionTextFont.getSize());
        } else {
            textView.setTypeface(null, 1);
        }
        textView.setText(translation);
        textView.setTextColor(color);
        textView.setContentDescription(translation);
        textView.setPadding(0, 0, 0, 10);
        List<String> activeLocalizedMultipleChoices = EmbeddedFeedbackUtilsJava.getActiveLocalizedMultipleChoices(embeddedFeedbackCreativeQuestion, this.options.Translations, this.currentLangCode);
        this.multipleChoiceRadioButtons = new ArrayList();
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.multiple_choice_radio_group);
        radioGroup.setPadding(18, convertDpToPixel(10.0f), 0, convertDpToPixel(EmbeddedFeedbackUtilsJava.getRadioGroupBottomPadding(this.options.Questions)));
        radioGroup.setVisibility(0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.10
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup2, int i) {
                EmbeddedFeedbackOrchestrator.this.onRadioButtonClicked(color2, i, view);
            }
        });
        for (int i = 0; i < activeLocalizedMultipleChoices.size(); i++) {
            RadioButton multipleChoiceRadioButton = getMultipleChoiceRadioButton(activeLocalizedMultipleChoices.get(i), color, color2, Color.parseColor(this.options.Questions.get(0).Appearance.RadioButtonUnselectedCircleColor), this.multipleChoiceIds[i], i);
            this.multipleChoiceRadioButtons.add(multipleChoiceRadioButton);
            radioGroup.addView(multipleChoiceRadioButton);
        }
        String translatedMultipleChoiceOtherOption = EmbeddedFeedbackUtilsJava.getTranslatedMultipleChoiceOtherOption(embeddedFeedbackCreativeQuestion, this.options.Translations, this.currentLangCode);
        if (translatedMultipleChoiceOtherOption != null) {
            int color3 = Color.parseColor(this.options.Questions.get(0).Appearance.RadioButtonUnselectedCircleColor);
            int[] iArr = this.multipleChoiceIds;
            RadioButton multipleChoiceRadioButton2 = getMultipleChoiceRadioButton(translatedMultipleChoiceOtherOption, color, color2, color3, iArr[iArr.length - 1], activeLocalizedMultipleChoices.size());
            this.multipleChoiceRadioButtons.add(multipleChoiceRadioButton2);
            radioGroup.addView(multipleChoiceRadioButton2);
            radioGroup.addView(getOtherOptionEditText());
        }
    }

    public void configureSubmitButton(View view) {
        Button button = (Button) view.findViewById(R.id.submit_button);
        EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions = this.options;
        EmbeddedFeedbackSubmitButtonAppearance embeddedFeedbackSubmitButtonAppearance = embeddedFeedbackCreativeOptions.SubmitButtonAppearance;
        button.setText(EmbeddedFeedbackUtils.getTranslation(embeddedFeedbackSubmitButtonAppearance.ButtonText, embeddedFeedbackCreativeOptions.Translations, this.currentLangCode, EmbeddedFeedbackUtils.SUBMIT_BUTTON_TEXT_KEY));
        FontTheme font = shouldThemeFonts(this.options, this.embeddedAppFeedbackTheme) ? this.embeddedAppFeedbackTheme.getSubmitButtonTheme().getFont() : null;
        if (font != null) {
            if (font.hasCustomTypeface()) {
                setTypefaceIfSupported(button, font.getFontRes());
            }
            button.setTextSize(2, font.getSize());
        }
        button.setTransformationMethod(null);
        button.setTextColor(Color.parseColor(embeddedFeedbackSubmitButtonAppearance.ButtonTextColor));
        button.setBackgroundColor(Color.parseColor(embeddedFeedbackSubmitButtonAppearance.ButtonFillColor));
        button.setOnClickListener(new View.OnClickListener() { // from class: com.qualtrics.digital.EmbeddedFeedbackOrchestrator.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                EmbeddedFeedbackOrchestrator.this.submitButtonPressed();
            }
        });
    }

    public void displayFollowupQuestion() {
        this.followupQuestion = EmbeddedFeedbackUtilsJava.getFollowupQuestion(this.options.Questions);
        this.multipleChoiceQuestion = EmbeddedFeedbackUtilsJava.getMultipleChoiceQuestion(this.options.Questions);
        View followupQuestionDialogView = getFollowupQuestionDialogView();
        Drawable drawable = this.context.getDrawable(R.drawable.embedded_feedback_modal_border);
        drawable.setColorFilter(new PorterDuffColorFilter(this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options) ? this.embeddedAppFeedbackTheme.getDialogBackgroundColor(this.themingUtils) : this.context.getColor(R.color.qualtricsDefaultBackground), PorterDuff.Mode.SRC_IN));
        followupQuestionDialogView.setBackground(drawable);
        EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion = this.multipleChoiceQuestion;
        if (embeddedFeedbackCreativeQuestion != null) {
            configureMultipleChoiceQuestionViews(followupQuestionDialogView, embeddedFeedbackCreativeQuestion);
        }
        configureFollowupQuestionLookAndFeelViews(followupQuestionDialogView, this.followupQuestion);
        configureSubmitButton(followupQuestionDialogView);
        this.followupQuestionDialog.setContentView(followupQuestionDialogView);
        this.followupQuestionDialog.setTitle(R.string.qualtrics_dialog_text);
        followupQuestionDialogView.measure(0, 0);
        double measuredHeight = followupQuestionDialogView.getMeasuredHeight();
        if (measuredHeight < ((double) this.screenHeight) * 0.3d) {
            followupQuestionDialogView.getLayoutParams().height = (this.screenHeight * 30) / 100;
            followupQuestionDialogView.requestLayout();
        }
        if (measuredHeight > ((double) this.screenHeight) * 0.9d) {
            followupQuestionDialogView.getLayoutParams().height = (this.screenHeight * 90) / 100;
            followupQuestionDialogView.requestLayout();
        }
        this.followupQuestionDialog.IconCompatParcelizer().setPeekHeight(this.screenHeight);
        showAlertDialog(this.followupQuestionDialog);
    }

    public void displayMultipleChoiceQuestion() {
        this.multipleChoiceQuestion = EmbeddedFeedbackUtilsJava.getMultipleChoiceQuestion(this.options.Questions);
        View followupQuestionDialogView = getFollowupQuestionDialogView();
        configureMultipleChoiceQuestionViews(followupQuestionDialogView, this.multipleChoiceQuestion);
        configureSubmitButton(followupQuestionDialogView);
        this.followupQuestionDialog.setContentView(followupQuestionDialogView);
        this.followupQuestionDialog.setTitle(R.string.qualtrics_dialog_text);
        Drawable drawable = this.context.getDrawable(R.drawable.embedded_feedback_modal_border);
        drawable.setColorFilter(new PorterDuffColorFilter(this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options) ? this.embeddedAppFeedbackTheme.getDialogBackgroundColor(this.themingUtils) : this.context.getColor(R.color.qualtricsDefaultBackground), PorterDuff.Mode.SRC_IN));
        followupQuestionDialogView.setBackground(drawable);
        followupQuestionDialogView.measure(0, 0);
        if (followupQuestionDialogView.getMeasuredHeight() < ((double) this.screenHeight) * 0.3d) {
            followupQuestionDialogView.getLayoutParams().height = (this.screenHeight * 30) / 100;
            followupQuestionDialogView.requestLayout();
        }
        this.followupQuestionDialog.IconCompatParcelizer().setPeekHeight(this.screenHeight);
        showAlertDialog(this.followupQuestionDialog);
    }

    public void displayThankYouMessage() {
        EmbeddedFeedbackCreativeQuestion thankYouMessage = EmbeddedFeedbackUtilsJava.getThankYouMessage(this.options.Questions);
        PlaceableKt placeableKt = new PlaceableKt(this.context, R.style.BottomSheetDialog);
        this.thankYouMessageDialog = placeableKt;
        placeableKt.setCancelable(false);
        View viewInflate = ((Activity) this.context).getLayoutInflater().inflate(R.layout.embedded_feedback_thank_you_message, (ViewGroup) null);
        configureCloseButton(viewInflate, this.thankYouMessageDialog, false);
        Drawable drawable = this.context.getDrawable(R.drawable.embedded_feedback_modal_border);
        drawable.setColorFilter(new PorterDuffColorFilter(this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options) ? this.embeddedAppFeedbackTheme.getDialogBackgroundColor(this.themingUtils) : this.context.getColor(R.color.qualtricsDefaultBackground), PorterDuff.Mode.SRC_IN));
        viewInflate.setBackground(drawable);
        String translation = EmbeddedFeedbackUtils.getTranslation(thankYouMessage.QuestionText, this.options.Translations, this.currentLangCode, EmbeddedFeedbackUtils.THANK_YOU_KEY);
        TextView textView = (TextView) viewInflate.findViewById(R.id.thank_you_message);
        FontTheme thankYouTextFont = shouldThemeFonts(this.options, this.embeddedAppFeedbackTheme) ? this.embeddedAppFeedbackTheme.getThankYouTheme().getThankYouTextFont() : null;
        if (thankYouTextFont != null) {
            if (thankYouTextFont.hasCustomTypeface()) {
                setTypefaceIfSupported(textView, thankYouTextFont.getFontRes());
            } else {
                textView.setTypeface(null, 1);
            }
            textView.setTextSize(2, this.embeddedAppFeedbackTheme.getThankYouTheme().getThankYouTextFont().getSize());
        } else {
            textView.setTypeface(null, 1);
        }
        textView.setText(translation);
        textView.setTextColor(Color.parseColor(this.options.Questions.get(0).Appearance.QuestionTextColor));
        textView.setContentDescription(translation);
        textView.setGravity(17);
        this.thankYouMessageDialog.setContentView(viewInflate);
        this.thankYouMessageDialog.setTitle(R.string.qualtrics_dialog_text);
        viewInflate.measure(0, 0);
        if (viewInflate.getMeasuredHeight() < ((double) this.screenHeight) * 0.3d) {
            viewInflate.getLayoutParams().height = (this.screenHeight * 30) / 100;
            viewInflate.requestLayout();
        }
        showAlertDialog(this.thankYouMessageDialog);
    }

    public View getFollowupQuestionDialogView() {
        PlaceableKt placeableKt = new PlaceableKt(this.context, R.style.BottomSheetDialog);
        this.followupQuestionDialog = placeableKt;
        placeableKt.setCancelable(false);
        View viewInflate = ((Activity) this.context).getLayoutInflater().inflate(R.layout.embedded_feedback_followup_question, (ViewGroup) null);
        configureCloseButton(viewInflate, this.followupQuestionDialog, true);
        return viewInflate;
    }

    public EmbeddedFeedbackOrchestrator(Context context, EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions, Properties properties, SiteInterceptService siteInterceptService, String str, String str2, String str3, EmbeddedFeedbackResponseManager embeddedFeedbackResponseManager, EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme) {
        String languageTag;
        this.options = embeddedFeedbackCreativeOptions;
        this.context = context;
        ThemingUtilsImpl themingUtilsImpl = new ThemingUtilsImpl(context);
        this.themingUtils = themingUtilsImpl;
        this.themeApplier = new ThemeApplier(themingUtilsImpl);
        this.screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
        String string = properties.getString("Q_Language");
        this.currentLangCode = string;
        if (string == null) {
            if (Locale.getDefault().toLanguageTag() != null) {
                languageTag = Locale.getDefault().toLanguageTag();
                int i = 2 % 2;
            } else {
                int i2 = read + 57;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
                languageTag = "Default";
            }
            this.currentLangCode = languageTag;
        }
        this.currentLangCode = this.currentLangCode.toUpperCase();
        String string2 = context.getResources().getString(R.string.extremely_unhelpful);
        if (string2.startsWith("%('")) {
            Object[] objArr = new Object[1];
            a(string2.substring(3), objArr);
            string2 = ((String) objArr[0]).intern();
        }
        String string3 = context.getResources().getString(R.string.somewhat_unhelpful);
        if (string3.startsWith("%('")) {
            Object[] objArr2 = new Object[1];
            a(string3.substring(3), objArr2);
            string3 = ((String) objArr2[0]).intern();
        }
        String string4 = context.getResources().getString(R.string.neither_helpful_nor_unhelpful);
        if (string4.startsWith("%('")) {
            Object[] objArr3 = new Object[1];
            a(string4.substring(3), objArr3);
            string4 = ((String) objArr3[0]).intern();
        }
        String string5 = context.getResources().getString(R.string.somewhat_helpful);
        if (string5.startsWith("%('")) {
            int i4 = IconCompatParcelizer + 83;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object[] objArr4 = new Object[1];
            a(string5.substring(3), objArr4);
            string5 = ((String) objArr4[0]).intern();
        }
        String string6 = context.getResources().getString(R.string.extremely_helpful);
        if (string6.startsWith("%('")) {
            Object[] objArr5 = new Object[1];
            a(string6.substring(3), objArr5);
            string6 = ((String) objArr5[0]).intern();
        }
        this.fivePointQuestionDescriptions = new String[]{string2, string3, string4, string5, string6};
        String string7 = context.getResources().getString(R.string.thumbs_up);
        if (string7.startsWith("%('")) {
            Object[] objArr6 = new Object[1];
            a(string7.substring(3), objArr6);
            string7 = ((String) objArr6[0]).intern();
        }
        String string8 = context.getResources().getString(R.string.thumbs_down);
        if (string8.startsWith("%('")) {
            int i6 = IconCompatParcelizer + 111;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                Object[] objArr7 = new Object[1];
                a(string8.substring(3), objArr7);
                ((String) objArr7[0]).intern();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strSubstring = string8.substring(3);
            Object[] objArr8 = new Object[1];
            a(strSubstring, objArr8);
            string8 = ((String) objArr8[0]).intern();
            int i7 = 2 % 2;
        }
        this.thumbsDescriptions = new String[]{string7, string8};
        this.responseManager = embeddedFeedbackResponseManager;
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(R.array.multiple_choice_ids);
        this.multipleChoiceIds = new int[typedArrayObtainTypedArray.length()];
        int i8 = 2 % 2;
        for (int i9 = 0; i9 < typedArrayObtainTypedArray.length(); i9++) {
            this.multipleChoiceIds[i9] = typedArrayObtainTypedArray.getResourceId(i9, 0);
        }
        typedArrayObtainTypedArray.recycle();
        this.siteInterceptService = siteInterceptService;
        this.actionSetID = str2;
        this.creativeID = str3;
        this.interceptID = str;
        this.clientCallbackUtils = ClientCallbackUtils.instance();
        this.embeddedAppFeedbackTheme = embeddedAppFeedbackTheme;
        int i10 = IconCompatParcelizer + 123;
        read = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }

    public void display() {
        displayInitialQuestion();
        displayIcons();
    }

    public void submitButtonPressed() {
        closeDialog(this.followupQuestionDialog, false);
        checkAndSubmitResponse();
        if (EmbeddedFeedbackUtilsJava.getThankYouMessage(this.options.Questions) != null) {
            displayThankYouMessage();
        } else {
            notifyListenerOfDialogClose();
        }
    }

    private RadioButton getMultipleChoiceRadioButton(String str, int i, int i2, int i3, int i4, int i5) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, convertDpToPixel(10.0f));
        RadioButton radioButton = new RadioButton(this.context);
        radioButton.setText(str);
        FontTheme textFont = shouldThemeFonts(this.options, this.embeddedAppFeedbackTheme) ? this.embeddedAppFeedbackTheme.getMultipleChoiceTheme().getRadioButtonsTheme().getTextFont() : null;
        if (textFont != null) {
            if (textFont.hasCustomTypeface()) {
                setTypefaceIfSupported(radioButton, textFont.getFontRes());
            }
            radioButton.setTextSize(2, textFont.getSize());
        } else {
            radioButton.setTextSize(2, 18.0f);
        }
        radioButton.setTextColor(i);
        radioButton.setId(i4);
        radioButton.setTag(Integer.valueOf(i5));
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(EmbeddedFeedbackUtils.getRadioButtonColorList(i2, i3));
        radioButton.setPadding(0, convertDpToPixel(10.0f), 0, convertDpToPixel(10.0f));
        return radioButton;
    }

    @SuppressLint
    private EditText getOtherOptionEditText() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(convertDpToPixel(30.0f), 0, convertDpToPixel(20.0f), 0);
        EditText editText = new EditText(this.context);
        editText.setId(R.id.other_option_edit_text);
        editText.setHeight(convertDpToPixel(40.0f));
        editText.setLayoutParams(layoutParams);
        editText.setEnabled(false);
        editText.setVisibility(0);
        editText.setImeOptions(6);
        editText.setRawInputType(1);
        editText.setBackgroundResource(R.drawable.rounded_rectangle);
        int color = this.context.getColor(R.color.qualtricsDefaultTextInput);
        int color2 = this.context.getColor(R.color.qualtricsDefaultTextInputBackground);
        if (this.themeApplier.shouldEmbeddedFeedbackUseTheming(this.options)) {
            color = this.embeddedAppFeedbackTheme.getMultipleChoiceTheme().getOtherAnswerTextColor(this.themingUtils);
            color2 = this.embeddedAppFeedbackTheme.getMultipleChoiceTheme().getOtherAnswerBackgroundColor(this.themingUtils);
        }
        FontTheme otherAnswerTextFont = shouldThemeFonts(this.options, this.embeddedAppFeedbackTheme) ? this.embeddedAppFeedbackTheme.getMultipleChoiceTheme().getOtherAnswerTextFont() : null;
        if (otherAnswerTextFont != null) {
            if (otherAnswerTextFont.hasCustomTypeface()) {
                setTypefaceIfSupported(editText, otherAnswerTextFont.getFontRes());
            }
            editText.setTextSize(2, otherAnswerTextFont.getSize());
        }
        editText.setTextColor(color);
        editText.getBackground().setColorFilter(color2, PorterDuff.Mode.SRC_ATOP);
        return editText;
    }

    private void setTypefaceIfSupported(TextView textView, int i) {
        textView.setTypeface(getTypeface(i));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x007e  */
    public void checkAndSubmitResponse() {
        if (this.followupQuestion != null) {
            this.responseManager.addToResponse(this.followupQuestion.SurveyQuestionId, ((EditText) this.followupQuestionDialog.findViewById(R.id.open_text_input)).getText().toString());
        }
        if (this.multipleChoiceQuestion != null) {
            RadioButton radioButton = (RadioButton) this.followupQuestionDialog.findViewById(((RadioGroup) this.followupQuestionDialog.findViewById(R.id.multiple_choice_radio_group)).getCheckedRadioButtonId());
            if (radioButton != null) {
                int id = radioButton.getId();
                int[] iArr = this.multipleChoiceIds;
                if (id == iArr[iArr.length - 1]) {
                    EditText editText = (EditText) this.followupQuestionDialog.findViewById(R.id.other_option_edit_text);
                    EmbeddedFeedbackResponseManager embeddedFeedbackResponseManager = this.responseManager;
                    String str = this.multipleChoiceQuestion.SurveyQuestionId;
                    int iIntValue = ((Integer) radioButton.getTag()).intValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(iIntValue + 1);
                    embeddedFeedbackResponseManager.addMultipleChoiceTextResponse(str, sb.toString(), editText.getText().toString());
                } else if (radioButton != null) {
                    EmbeddedFeedbackResponseManager embeddedFeedbackResponseManager2 = this.responseManager;
                    String str2 = this.multipleChoiceQuestion.SurveyQuestionId;
                    int iIntValue2 = ((Integer) radioButton.getTag()).intValue();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iIntValue2 + 1);
                    embeddedFeedbackResponseManager2.addToResponse(str2, sb2.toString());
                }
            } else if (radioButton != null) {
                EmbeddedFeedbackResponseManager embeddedFeedbackResponseManager3 = this.responseManager;
                String str3 = this.multipleChoiceQuestion.SurveyQuestionId;
                int iIntValue3 = ((Integer) radioButton.getTag()).intValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(iIntValue3 + 1);
                embeddedFeedbackResponseManager3.addToResponse(str3, sb3.toString());
            }
        }
        this.responseManager.postResponse();
    }

    public LinearLayout.LayoutParams getInitialQuestionLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(convertDpToPixel(16.0f), convertDpToPixel(8.0f), convertDpToPixel(16.0f), convertDpToPixel(16.0f));
        return layoutParams;
    }

    private Drawable createTextButtonDrawable(String str, boolean z) {
        EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions = this.options;
        int color = Color.parseColor(z ? embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.ButtonBorderColor : embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.NoButtonBorderColor);
        EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions2 = this.options;
        int color2 = Color.parseColor(z ? embeddedFeedbackCreativeOptions2.Questions.get(0).Appearance.ButtonFillColor : embeddedFeedbackCreativeOptions2.Questions.get(0).Appearance.NoButtonFillColor);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color2);
        gradientDrawable.setCornerRadius(convertDpToPixel(4.0f));
        gradientDrawable.setStroke(convertDpToPixel(2.0f), color);
        return gradientDrawable;
    }

    private Button createYesNoButton(View view, String str, boolean z) {
        EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions = this.options;
        int color = Color.parseColor(z ? embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.ButtonTextColor : embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.NoButtonTextColor);
        Button button = new Button(view.getContext());
        button.setText(str);
        button.setContentDescription(str);
        button.setTextColor(color);
        FontTheme buttonFontTheme = EmbeddedFeedbackUtils.getButtonFontTheme(this.embeddedAppFeedbackTheme, z);
        if (buttonFontTheme != null) {
            if (buttonFontTheme.hasCustomTypeface()) {
                setTypefaceIfSupported(button, buttonFontTheme.getFontRes());
            }
            button.setTextSize(2, buttonFontTheme.getSize());
        } else {
            button.setTextSize(16.0f);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = convertDpToPixel(10.0f);
        layoutParams.leftMargin = convertDpToPixel(10.0f);
        button.setLayoutParams(layoutParams);
        button.setGravity(17);
        button.setPadding(convertDpToPixel(12.0f), 0, convertDpToPixel(12.0f), 0);
        button.setBackground(createTextButtonDrawable(str, z));
        button.setTransformationMethod(null);
        return button;
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ write);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
