package o;

import com.roadrunner.customerchat.selfservice.data.repository.WebChatNativeAssetRepositoryImpl;
import com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase$downloadAndStore$1;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextLayoutInput {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final startDocument write;

    public getTextLayoutInput(startDocument startdocument) {
        startdocument.getClass();
        this.write = startdocument;
    }

    public final Object read(getDefaultIndentationXSAIIZE getdefaultindentationxsaiize, DownloadChatAssetsUseCase$downloadAndStore$1 downloadChatAssetsUseCase$downloadAndStore$1) {
        int i = 2 % 2;
        int i2 = read + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objDownloadAsset = ((WebChatNativeAssetRepositoryImpl) this.write).downloadAsset(getdefaultindentationxsaiize.IconCompatParcelizer, downloadChatAssetsUseCase$downloadAndStore$1);
        int i4 = read + 7;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objDownloadAsset;
        }
        throw null;
    }
}
