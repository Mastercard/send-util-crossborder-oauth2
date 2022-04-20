package com.mastercard.oauth2.requesttoken.models;

import com.nimbusds.jose.JWSAlgorithm;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
 @Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TokenInput {

     // flag to indicate if token signing certificate chain should be added in token itself while building a token
     @Builder.Default
     private int tokenLifetime = 15 * 60 * 1000;

     // token signing algorithm
     @Builder.Default
     private JWSAlgorithm tokenSigningAlgorithm = JWSAlgorithm.RS256;

}
