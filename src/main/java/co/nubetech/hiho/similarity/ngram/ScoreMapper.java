/**
 * Copyright 2011 Nube Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package co.nubetech.hiho.similarity.ngram;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.log4j.Logger;
public class ScoreMapper extends
		Mapper<ValuePair, IntWritable, ValuePair, IntWritable> {

	final static Logger logger = Logger
			.getLogger(co.nubetech.hiho.similarity.ngram.ScoreMapper.class);

	@Override
	public void map(ValuePair key, IntWritable val, Context context)
			throws IOException, InterruptedException {
		if (key == null) {
			throw new IOException("Key is null");
		}
		context.write(key, val);
	}
}
