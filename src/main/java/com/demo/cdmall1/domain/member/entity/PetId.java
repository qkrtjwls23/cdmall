package com.demo.cdmall1.domain.member.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PetId implements Serializable {
	private String member;
	private Integer petno;
}
