package com.example.concurrency.presentation.favorite_screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent;", "", "DeleteCurrency", "GetFavoriteCurrencies", "InsertCurrency", "Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent$DeleteCurrency;", "Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent$GetFavoriteCurrencies;", "Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent$InsertCurrency;", "app_debug"})
public abstract interface FavoriteCurrencyEvent {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent$InsertCurrency;", "Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent;", "currencyEntity", "Lcom/example/concurrency/data/remote/model/DataX;", "(Lcom/example/concurrency/data/remote/model/DataX;)V", "getCurrencyEntity", "()Lcom/example/concurrency/data/remote/model/DataX;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class InsertCurrency implements com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.data.remote.model.DataX currencyEntity = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyEvent.InsertCurrency copy(@org.jetbrains.annotations.NotNull
        com.example.concurrency.data.remote.model.DataX currencyEntity) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public InsertCurrency(@org.jetbrains.annotations.NotNull
        com.example.concurrency.data.remote.model.DataX currencyEntity) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.data.remote.model.DataX component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.data.remote.model.DataX getCurrencyEntity() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent$DeleteCurrency;", "Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent;", "currencyEntity", "Lcom/example/concurrency/data/remote/model/DataX;", "(Lcom/example/concurrency/data/remote/model/DataX;)V", "getCurrencyEntity", "()Lcom/example/concurrency/data/remote/model/DataX;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DeleteCurrency implements com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.data.remote.model.DataX currencyEntity = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyEvent.DeleteCurrency copy(@org.jetbrains.annotations.NotNull
        com.example.concurrency.data.remote.model.DataX currencyEntity) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DeleteCurrency(@org.jetbrains.annotations.NotNull
        com.example.concurrency.data.remote.model.DataX currencyEntity) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.data.remote.model.DataX component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.data.remote.model.DataX getCurrencyEntity() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent$GetFavoriteCurrencies;", "Lcom/example/concurrency/presentation/favorite_screen/FavoriteCurrencyEvent;", "()V", "app_debug"})
    public static final class GetFavoriteCurrencies implements com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.example.concurrency.presentation.favorite_screen.FavoriteCurrencyEvent.GetFavoriteCurrencies INSTANCE = null;
        
        private GetFavoriteCurrencies() {
            super();
        }
    }
}