/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpmorgan.cakeshop.model.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import com.jpmorgan.cakeshop.util.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WalletDeserializer extends JsonDeserializer<WalletPostJsonRequest> {

    @Override
    public WalletPostJsonRequest deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
        WalletPostJsonRequest request = new WalletPostJsonRequest();
        JsonNode node = jp.getCodec().readTree(jp);

        if (null != node.get("privateFor")) {
            JsonNode privateForNode = node.get("privateFor");
            List<String> privateFor = null;

            if (privateForNode.isArray()) {
                privateFor = Lists.newArrayList();
                for (Iterator<JsonNode> iter = privateForNode.elements(); iter.hasNext();) {
                    privateFor.add(iter.next().asText());
                }
            } else {
                if (StringUtils.isNotBlank(node.get("privateFor").textValue())) {
                    privateFor = Lists.newArrayList(node.get("privateFor").textValue());
                }
            }

            request.setPrivateFor(privateFor);
        }

        if (null != node.get("fromAccount")) {
            request.setFromAccount(node.get("fromAccount").textValue());
        }

        if (null != node.get("data")) {
            request.setData(node.get("data").textValue());
        }

        if (null != node.get("account")) {
            request.setAccount(node.get("account").textValue());
        }

        if (null != node.get("accountPassword")) {
            request.setAccountPassword(node.get("accountPassword").textValue());
        }

        if (null != node.get("newBalance")) {
            request.setNewBalance(Long.parseLong(node.get("newBalance").textValue()));
        }

        return request;
    }
}
