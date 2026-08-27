package com.google.android.gms.internal.mlkit_vision_face;

import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CanonicalTileID;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.SourceAdded;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceRemoved;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.extension.observable.eventdata.CameraChangedEventData;
import com.mapbox.maps.extension.observable.eventdata.MapIdleEventData;
import com.mapbox.maps.extension.observable.eventdata.MapLoadedEventData;
import com.mapbox.maps.extension.observable.eventdata.MapLoadingErrorEventData;
import com.mapbox.maps.extension.observable.eventdata.RenderFrameFinishedEventData;
import com.mapbox.maps.extension.observable.eventdata.RenderFrameStartedEventData;
import com.mapbox.maps.extension.observable.eventdata.SourceAddedEventData;
import com.mapbox.maps.extension.observable.eventdata.SourceDataLoadedEventData;
import com.mapbox.maps.extension.observable.eventdata.SourceRemovedEventData;
import com.mapbox.maps.extension.observable.eventdata.StyleDataLoadedEventData;
import com.mapbox.maps.extension.observable.eventdata.StyleImageMissingEventData;
import com.mapbox.maps.extension.observable.eventdata.StyleImageUnusedEventData;
import com.mapbox.maps.extension.observable.eventdata.StyleLoadedEventData;
import com.mapbox.maps.extension.observable.model.MapLoadErrorType;
import com.mapbox.maps.extension.observable.model.RenderMode;
import com.mapbox.maps.extension.observable.model.SourceDataType;
import com.mapbox.maps.extension.observable.model.StyleDataType;
import com.mapbox.maps.extension.observable.model.TileID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzlq {
    public static final CameraChangedEventData toCameraChangedEventData(CameraChanged cameraChanged) {
        return new CameraChangedEventData(cameraChanged.getTimestamp().getTime(), Long.valueOf(cameraChanged.getTimestamp().getTime()));
    }

    public static final MapIdleEventData toMapIdleEventData(MapIdle mapIdle) {
        return new MapIdleEventData(mapIdle.getTimestamp().getTime(), Long.valueOf(mapIdle.getTimestamp().getTime()));
    }

    public static final MapLoadedEventData toMapLoadedEventData(MapLoaded mapLoaded) {
        return new MapLoadedEventData(mapLoaded.getTimeInterval().getBegin().getTime(), Long.valueOf(mapLoaded.getTimeInterval().getEnd().getTime()));
    }

    public static final MapLoadingErrorEventData toMapLoadingErrorEventData(MapLoadingError mapLoadingError) {
        long time = mapLoadingError.getTimestamp().getTime();
        long time2 = mapLoadingError.getTimestamp().getTime();
        MapLoadErrorType mapLoadErrorTypeValueOf = MapLoadErrorType.valueOf(mapLoadingError.getType().name());
        String message = mapLoadingError.getMessage();
        message.getClass();
        String sourceId = mapLoadingError.getSourceId();
        CanonicalTileID tileId = mapLoadingError.getTileId();
        return new MapLoadingErrorEventData(time, Long.valueOf(time2), mapLoadErrorTypeValueOf, message, sourceId, tileId != null ? new TileID(tileId.getZ(), tileId.getX(), tileId.getY()) : null);
    }

    public static final RenderFrameFinishedEventData toRenderFrameFinishedEventData(RenderFrameFinished renderFrameFinished) {
        long time = renderFrameFinished.getTimeInterval().getBegin().getTime();
        long time2 = renderFrameFinished.getTimeInterval().getEnd().getTime();
        return new RenderFrameFinishedEventData(time, Long.valueOf(time2), RenderMode.valueOf(renderFrameFinished.getRenderMode().name()), renderFrameFinished.getNeedsRepaint(), renderFrameFinished.getPlacementChanged());
    }

    public static final RenderFrameStartedEventData toRenderFrameStartedEventData(RenderFrameStarted renderFrameStarted) {
        return new RenderFrameStartedEventData(renderFrameStarted.getTimestamp().getTime(), Long.valueOf(renderFrameStarted.getTimestamp().getTime()));
    }

    public static final SourceAddedEventData toSourceAddedEventData(SourceAdded sourceAdded) {
        long time = sourceAdded.getTimestamp().getTime();
        long time2 = sourceAdded.getTimestamp().getTime();
        String sourceId = sourceAdded.getSourceId();
        sourceId.getClass();
        return new SourceAddedEventData(sourceId, time, Long.valueOf(time2));
    }

    public static final SourceDataLoadedEventData toSourceDataLoadedEventData(SourceDataLoaded sourceDataLoaded) {
        long time = sourceDataLoaded.getTimeInterval().getBegin().getTime();
        long time2 = sourceDataLoaded.getTimeInterval().getEnd().getTime();
        String sourceId = sourceDataLoaded.getSourceId();
        sourceId.getClass();
        SourceDataType sourceDataTypeValueOf = SourceDataType.valueOf(sourceDataLoaded.getType().name());
        Boolean loaded = sourceDataLoaded.getLoaded();
        CanonicalTileID tileId = sourceDataLoaded.getTileId();
        return new SourceDataLoadedEventData(time, Long.valueOf(time2), sourceId, sourceDataTypeValueOf, loaded, tileId != null ? new TileID(tileId.getZ(), tileId.getX(), tileId.getY()) : null);
    }

    public static final SourceRemovedEventData toSourceRemovedEventData(SourceRemoved sourceRemoved) {
        long time = sourceRemoved.getTimestamp().getTime();
        long time2 = sourceRemoved.getTimestamp().getTime();
        String sourceId = sourceRemoved.getSourceId();
        sourceId.getClass();
        return new SourceRemovedEventData(sourceId, time, Long.valueOf(time2));
    }

    public static final StyleDataLoadedEventData toStyleDataLoadedEventData(StyleDataLoaded styleDataLoaded) {
        long time = styleDataLoaded.getTimeInterval().getBegin().getTime();
        long time2 = styleDataLoaded.getTimeInterval().getEnd().getTime();
        return new StyleDataLoadedEventData(time, Long.valueOf(time2), StyleDataType.valueOf(styleDataLoaded.getType().name()));
    }

    public static final StyleImageMissingEventData toStyleImageMissingEventData(StyleImageMissing styleImageMissing) {
        long time = styleImageMissing.getTimestamp().getTime();
        long time2 = styleImageMissing.getTimestamp().getTime();
        String imageId = styleImageMissing.getImageId();
        imageId.getClass();
        return new StyleImageMissingEventData(imageId, time, Long.valueOf(time2));
    }

    public static final StyleImageUnusedEventData toStyleImageUnusedEventData(StyleImageRemoveUnused styleImageRemoveUnused) {
        long time = styleImageRemoveUnused.getTimestamp().getTime();
        long time2 = styleImageRemoveUnused.getTimestamp().getTime();
        String imageId = styleImageRemoveUnused.getImageId();
        imageId.getClass();
        return new StyleImageUnusedEventData(imageId, time, Long.valueOf(time2));
    }

    public static final StyleLoadedEventData toStyleLoadedEventData(StyleLoaded styleLoaded) {
        return new StyleLoadedEventData(styleLoaded.getTimeInterval().getBegin().getTime(), Long.valueOf(styleLoaded.getTimeInterval().getEnd().getTime()));
    }
}
