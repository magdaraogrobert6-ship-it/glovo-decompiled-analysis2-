package o;

import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.compress.archivers.sevenz.LZMADecoder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getVariantName {
    public static final ViewRootForInspectorDefaultImpls write;

    static {
        ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = new ViewRootForInspectorDefaultImpls();
        int i = 0;
        int i2 = 4;
        viewRootForInspectorDefaultImpls.put(getChatID.COPY, new LZMADecoder(new Class[0], i2));
        viewRootForInspectorDefaultImpls.put(getChatID.LZMA, new LZMADecoder(new Class[]{getUpdateFeaturesfwf_client_release.class, Number.class}, i));
        viewRootForInspectorDefaultImpls.put(getChatID.LZMA2, new LZMADecoder(new Class[]{getUpdateFeaturesfwf_client_release.class, Number.class}, 7));
        int i3 = 1;
        viewRootForInspectorDefaultImpls.put(getChatID.DEFLATE, new LZMADecoder(new Class[]{Number.class}, i3));
        int i4 = 5;
        viewRootForInspectorDefaultImpls.put(getChatID.DEFLATE64, new LZMADecoder(new Class[]{Number.class}, i4));
        int i5 = 3;
        viewRootForInspectorDefaultImpls.put(getChatID.BZIP2, new LZMADecoder(new Class[]{Number.class}, i5));
        int i6 = 2;
        viewRootForInspectorDefaultImpls.put(getChatID.AES256SHA256, new LZMADecoder(new Class[]{FoodoraMigrationException.class}, i6));
        viewRootForInspectorDefaultImpls.put(getChatID.BCJ_X86_FILTER, new getRawValue(new getHeroDomainsfwf_client_release(i4)));
        viewRootForInspectorDefaultImpls.put(getChatID.BCJ_PPC_FILTER, new getRawValue(new getHeroDomainsfwf_client_release(i5)));
        viewRootForInspectorDefaultImpls.put(getChatID.BCJ_IA64_FILTER, new getRawValue(new getHeroDomainsfwf_client_release(i6)));
        viewRootForInspectorDefaultImpls.put(getChatID.BCJ_ARM_FILTER, new getRawValue(new getHeroDomainsfwf_client_release(i)));
        viewRootForInspectorDefaultImpls.put(getChatID.BCJ_ARM_THUMB_FILTER, new getRawValue(new getHeroDomainsfwf_client_release(i3)));
        viewRootForInspectorDefaultImpls.put(getChatID.BCJ_SPARC_FILTER, new getRawValue(new getHeroDomainsfwf_client_release(i2)));
        viewRootForInspectorDefaultImpls.put(getChatID.DELTA_FILTER, new LZMADecoder(new Class[]{Number.class}, 6));
        write = viewRootForInspectorDefaultImpls;
    }

    public static InputStream IconCompatParcelizer(String str, InputStream inputStream, long j, FoodoraSwitchWrongException foodoraSwitchWrongException, byte[] bArr, int i) throws IOException {
        byte[] bArr2 = foodoraSwitchWrongException.RemoteActionCompatParcelizer;
        FoodoraCodReasonCompanion foodoraCodReasonCompanion = (FoodoraCodReasonCompanion) write.get(getChatID.byId(bArr2));
        if (foodoraCodReasonCompanion != null) {
            return foodoraCodReasonCompanion.write(str, inputStream, j, foodoraSwitchWrongException, bArr, i);
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Unsupported compression method ", Arrays.toString(bArr2), " used in ", str);
        return null;
    }
}
