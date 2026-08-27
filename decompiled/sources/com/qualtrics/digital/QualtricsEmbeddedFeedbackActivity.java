package com.qualtrics.digital;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.qualtrics.digital.ui.EdgeToEdge;
import java.util.Iterator;
import java.util.Map;
import o.onTrimMemory;

/* JADX INFO: loaded from: classes4.dex */
public class QualtricsEmbeddedFeedbackActivity extends AppCompatActivity {
    private EmbeddedFeedbackCreative mEmbeddedFeedbackCreative;
    EmbeddedFeedbackOrchestrator orchestrator;
    SiteInterceptService siteInterceptService = SiteInterceptService.instance();

    /* JADX INFO: loaded from: classes5.dex */
    public final class IntentKeys {
        static final String ACTION_SET_ID = "ACTION_SET_ID";
        static final String BASE_URL = "BASE_URL";
        static final String CREATIVE = "CREATIVE";
        static final String CREATIVE_ID = "CREATIVE_ID";
        static final String EMBEDDED_DATA = "EMBEDDED_DATA";
        static final String INTERCEPT_ID = "INTERCEPT_ID";
        static final String SURVEY_ID = "SURVEY_ID";

        public IntentKeys() {
        }
    }

    public void setOrientation() {
        setRequestedOrientation(1);
    }

    private void spreadDefaultTheming(ThemingUtils themingUtils) {
        EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions = this.mEmbeddedFeedbackCreative.CreativeDefinition.Options;
        embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.RadioButtonUnselectedCircleColor = themingUtils.getHexColor(-12303292);
        Iterator<EmbeddedFeedbackCreativeQuestion> it = embeddedFeedbackCreativeOptions.Questions.iterator();
        while (it.hasNext()) {
            EmbeddedFeedbackQuestionAppearance embeddedFeedbackQuestionAppearance = it.next().Appearance;
            embeddedFeedbackQuestionAppearance.NoButtonBorderColor = embeddedFeedbackQuestionAppearance.ButtonBorderColor;
            embeddedFeedbackQuestionAppearance.NoButtonFillColor = embeddedFeedbackQuestionAppearance.ButtonFillColor;
            embeddedFeedbackQuestionAppearance.NoButtonTextColor = embeddedFeedbackQuestionAppearance.ButtonTextColor;
        }
    }

    private void spreadEmojisAndThumbsColors() {
        EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions = this.mEmbeddedFeedbackCreative.CreativeDefinition.Options;
        embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.ThumbUpBorderColor = embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.BorderColor;
        embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.ThumbDownBorderColor = embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.BorderColor;
        embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.ThumbUpFillColor = embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.FillColor;
        embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.ThumbDownFillColor = embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.FillColor;
        embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.EmojiBorderColor = embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.BorderColor;
        embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.EmojiFillColor = embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.FillColor;
        embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.EmojiTintColor = embeddedFeedbackCreativeOptions.Questions.get(0).Appearance.BorderColor;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setOrientation();
        super.onCreate(bundle);
        try {
            onTrimMemory supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.IconCompatParcelizer(getDrawable(R.drawable.bottom_border));
                supportActionBar.serializer(0.0f);
                supportActionBar.IconCompatParcelizer();
            } else {
                QualtricsLog.logError("Support action bar is null");
            }
            getWindow().setSoftInputMode(16);
            EdgeToEdge.enableWhenSupportedFor(this);
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("SURVEY_ID");
            String stringExtra2 = intent.getStringExtra("ACTION_SET_ID");
            String stringExtra3 = intent.getStringExtra("INTERCEPT_ID");
            String stringExtra4 = intent.getStringExtra("CREATIVE_ID");
            String stringExtra5 = intent.getStringExtra("BASE_URL");
            Map map = (Map) intent.getSerializableExtra("EMBEDDED_DATA");
            this.mEmbeddedFeedbackCreative = (EmbeddedFeedbackCreative) new Gson().fromJson(intent.getStringExtra("CREATIVE"), EmbeddedFeedbackCreative.class);
            ThemingUtilsImpl themingUtilsImpl = new ThemingUtilsImpl(getApplicationContext());
            ThemeApplier themeApplier = new ThemeApplier(themingUtilsImpl);
            spreadEmojisAndThumbsColors();
            spreadDefaultTheming(themingUtilsImpl);
            if (themeApplier.shouldEmbeddedFeedbackUseTheming(this.mEmbeddedFeedbackCreative.CreativeDefinition.Options)) {
                EmbeddedFeedbackCreativeDefinition embeddedFeedbackCreativeDefinition = this.mEmbeddedFeedbackCreative.CreativeDefinition;
                embeddedFeedbackCreativeDefinition.Options = themeApplier.computeEmbeddedFeedbackCreativeOptionsTheming(embeddedFeedbackCreativeDefinition.Options, Qualtrics.instance().creativeTheme);
            }
            EmbeddedFeedbackOrchestrator embeddedFeedbackOrchestrator = new EmbeddedFeedbackOrchestrator(this, this.mEmbeddedFeedbackCreative.CreativeDefinition.Options, Qualtrics.instance().properties, SiteInterceptService.instance(), stringExtra3, stringExtra2, stringExtra4, new EmbeddedFeedbackResponseManager(stringExtra3, stringExtra5, stringExtra, map, this.mEmbeddedFeedbackCreative.CreativeDefinition.Options.SurveyVersionId, SDKUtils.instance(), SiteInterceptService.instance(), Properties.instance(getApplicationContext())), Qualtrics.instance().creativeTheme.getEmbeddedAppFeedbackTheme());
            this.orchestrator = embeddedFeedbackOrchestrator;
            embeddedFeedbackOrchestrator.display();
        } catch (Exception e) {
            this.siteInterceptService.postErrorLog("Unable to start MEF Activity", true, e);
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
